package week6.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
       int left = 0;
       int right = array.length - 1;

       while (left <= right){
           int mid = left + (right - left) / 2;
           if (array[mid] == searchedValue){
               return true;
           } else if (array[mid] < searchedValue){
               left = mid + 1;
           } else{
               right = mid - 1;
           }
       }
       return false;
    }

}
