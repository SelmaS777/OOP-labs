package week6.Task7;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    public void printLine(){
        Random random = new Random();
        int starsInLine = 0;

        for (int i = 0; i < this.width; i++){
            double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0

            if (randomValue <= this.density){
                System.out.print("*");
                starsInLine++;
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
        this.starsInLastPrint += starsInLine;
    }

    public void print(){
        for (int i = 0; i < this.height; i++){
            this.printLine();
        }
    }

    public int starsInLastPrint(){
        int previousStars = this.starsInLastPrint;
        this.starsInLastPrint = 0; // resetting starsInLastPrint for the next print
        return previousStars;
    }
}

