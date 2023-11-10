package week6.Task2;

import java.lang.module.FindException;

public class IndexOfTheSmallest {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }
    public static int indexOfTheSmallest(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int indexOfSmallest = 0;
        int smallestValue = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < smallestValue){
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }
}
