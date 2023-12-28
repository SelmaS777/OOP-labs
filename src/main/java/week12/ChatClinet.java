package week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClinet {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ChatClient <username> <serverIP>");
            System.exit(1);
        }

        String username = args[0];
        String serverIP = args[1];
        int port = 8080;

        try {
            Socket socket = new Socket(serverIP, port);
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);

            serverWriter.println(username);

            Thread recieveThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = serverReader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            recieveThread.start();

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while ((userInput = consoleReader.readLine()) != null) {
                serverWriter.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
