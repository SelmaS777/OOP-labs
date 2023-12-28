package week12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<ClientHandler> clients = new ArrayList <>();

    public void start(int port){
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port" + port);

            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);

                Thread clientThread = new Thread(clientHandler);
                clientThread.start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void broadcastMessage(String message, ClientHandler sender){
        for (ClientHandler client: clients){
            if (client != sender){
                client.sendMessage(message);
            }
        }
    }
    private class ClientHandler implements Runnable{
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;

        public ClientHandler(Socket socket){
            this.socket = socket;

            try{
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try{
                writer.println("Enter your username: ");
                String username = reader.readLine();
                System.out.println(username + "has joined the chat");
                broadcastMessage(username + "has joined the chat", this);

                String clientMessage;
                while ((clientMessage = reader.readLine()) != null){
                    broadcastMessage(username + ": " + clientMessage, this);
                }
            }catch (IOException e){
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                    clients.remove(this);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        public void sendMessage(String message) {
            writer.println(message);
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        int port = 8080;
        chatServer.start(port);
    }
 }



