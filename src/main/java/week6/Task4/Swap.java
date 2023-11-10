package week6.Task4;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
    }
    public static void swap(int[] array, int index1, int index2){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        for (int i = 0; i < array.length; i++){
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}
