package week6.Task1;

public class SmallestValue {
    public static void main(String[] args) throws IllegalAccessException {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }
    public static int smallest(int[] array) throws IllegalAccessException {
        if(array == null ||  array.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        int smallestValue = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < smallestValue){
                smallestValue = array[i];
            }
        }

        return smallestValue;
    }
}
