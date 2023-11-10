package week6.Task9;

import java.util.HashMap;
import java.util.Scanner;

public class BirdwatchersDatabase {
    private HashMap<String, Bird> birdDatabase;
    private Scanner scanner;

    public BirdwatchersDatabase(Scanner scanner){
        this.birdDatabase = new HashMap<String, Bird>();
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine().trim().toLowerCase();

            if(command.equals("add")){
                addBird();
            } else if(command.equals("observation")){
                observeBird();
            } else if(command.equals("statistics")){
                printStatistics();
            }else if(command.equals("show")){
                showBird();
            }else if(command.equals("quit")){
                break;
            } else{
                System.out.println("Invalid command. Try again.");
            }
        }
    }
    private void addBird(){
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine().trim();

        Bird newBird = new Bird(name, latinName);
        birdDatabase.put(name.toLowerCase(), newBird);
    }

    private void observeBird(){
        System.out.print("What was observed? ");
        String birdName = scanner.nextLine().trim().toLowerCase();

        if(birdDatabase.containsKey(birdName)){
            birdDatabase.get(birdName).observe();
        } else{
            System.out.println("Is not a bird!");
        }
    }
    private void printStatistics(){
        for(Bird bird : birdDatabase.values()){
            bird.printStatistics();
        }
    }
    private void showBird(){
        System.out.print("What? ");
        String birdName = scanner.nextLine().trim().toLowerCase();

        if(birdDatabase.containsKey(birdName)){
            birdDatabase.get(birdName).printStatistics();
        } else{
            System.out.println("Is not a bird!");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BirdwatchersDatabase database = new BirdwatchersDatabase(scanner);
        database.start();
    }
}
class Bird{
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observe(){
        observations++;
    }

    public void printStatistics(){
        System.out.println(name + " (" + latinName + "): " + observations + " observations");
    }


}