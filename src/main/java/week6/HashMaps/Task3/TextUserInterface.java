package week6.HashMaps.Task3;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statements: ");
        System.out.println("   add - adds a word pair to the directory");
        System.out.println("   translate - asks a word and prints its translation");
        System.out.println("   quit - quits the text user interface");
        System.out.println();

        while (true){
            System.out.print("Statement: ");
            String statement = reader.nextLine();

            if (statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(statement.equals("add")){
                addWordPair();
            }else if(statement.equals("translate")){
                translateWord();
            } else{
                System.out.println("Unknown statement");
                System.out.println();
            }
        }
    }

    private void addWordPair(){
        System.out.print("In Finnish: ");
        String finnishWord = reader.nextLine();

        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(finnishWord, translation);

        System.out.println();
    }

    private void translateWord(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        System.out.println("Translation: " + (translation != null ? translation : "null"));
        System.out.println();
    }

    public static void main(String[] args) {
        /*HashMap<String, String> wordPairs = new HashMap<>();
        wordPairs.put("monkey", "animal");
        wordPairs.put("South", "compass point");
        wordPairs.put("sauerkraut", "food");

        for (String key : wordPairs.keySet()){
            System.out.print(key + " ");
        }*/

        //prints: monkey South saerkraut

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}

