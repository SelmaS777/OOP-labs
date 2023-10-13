package org.example;
import java.util.Scanner; //allows us to read user input from the console
import java.util.Random;

/*
// 1.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "password";

        while(true) {
            String inputPassword;
            System.out.print("Password: ");

            inputPassword = scanner.nextLine(); // we use object 'scanner' to read the input prom the console and store it in the 'inputPassword' variable.
                                                // 'nextLine()' reads the entire line of text entered by the user
            if (inputPassword.equals(password)) {
                System.out.println("Right!");
                System.out.println("\nThe secret is: jryy qbar");
                break;
            } else{
                System.out.println("Wrong!");
            }

            scanner.close();
        }
    }
}
 */

/*
// 2.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        for (int i = 1; i <= 3; i++){
            System.out.print("Type the " + i + " number: ");
            read = reader.nextInt(); //method call using the 'Scanner' object 'reader'
                                     // 'nextInt()' is used to read an integer.
            sum += read;
        }

        System.out.println("\nSum: " + sum);
        reader.close();
    }
}
 */

/*
// 3.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while(true){
            int read = Integer.parseInt(reader.nextLine()); //'Integer.parseInt()' is a method that converts a string containing an integer into an actual integer
            if(read == 0){
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
        reader.close();
    }
}
 */
/*
// 4.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Fist: ");
        int first = reader.nextInt();

        System.out.print("Last: ");
        int last = reader.nextInt();

        int i = first;
        if(first <= last){
            while (i <= last){
                System.out.print(i);
                System.out.print("\n");
                i++;
            }
        } else{
            System.out.println();
        }
        reader.close();
    }
}
 */

/*
// 5.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        reader.close();

        int sum = 0;
        //Calculation
        for(int i = 0; i <= number; i++){
            int power = (int) Math.pow(2,i);
            sum += power;
        }
        System.out.println("The result is " + sum);
    }
}
 */

/*
// 6.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("How many times the text should be printed: ");
        int number = reader.nextInt();

        for(int i = 0; i < number; i++){
            printText();
        }
        reader.close();
    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
 */

/*
// 7.
public class Main{
    public static void printStars(int amount){
        for(int i = 0; i < amount; i++){
            System.out.print("*");
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
*/

/*
// 8.
public class Main{
    public static void drawStarsPiramid(int numberOfRows){
        for (int i = 0; i < numberOfRows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        drawStarsPiramid(5);
        drawStarsPiramid(10);
    }
}
*/

/*
// 8. - b) How to print the inverted half piramid shape as shown in the image below?

public class Main{
    public static void drawStarsPiramid(int numberOfRows){
        for (int i = numberOfRows; i >= 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        drawStarsPiramid(5);
        drawStarsPiramid(10);
    }
}
*/

/*
// 9.
public class Main{
    public static void drawStarsPiramid(int numberOfRows){
        for (int i = 0; i < numberOfRows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        drawStarsPiramid(5);
        drawStarsPiramid(10);
    }
}
// 9. - b) What if I want the following output? What should be changed?
//We would replace j with i in output: System.out.print(i + 1 + " ");
 */

// 10.
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = drawNumber(random);
        int counter = 1;

        while(true){
            System.out.print("Guess a number: ");
            int guessNumber = reader.nextInt();

            if(guessNumber < randomNumber){
                System.out.println("The number is greater, guess made: " + counter);
            } else if (guessNumber > randomNumber){
                System.out.println("The number is lesser, guess made: " + counter);
                } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            counter++;
        }
    }

    public static int drawNumber(Random random){
        return random.nextInt(101);
    }
}
