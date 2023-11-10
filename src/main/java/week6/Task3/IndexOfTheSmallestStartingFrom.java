package week6.Task3;

public class IndexOfTheSmallestStartingFrom {
    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int indexOfSmallest = index;
        int smallestValue = array[index];

        for (int i = index; i < array.length; i++){
            if (array[i] < smallestValue){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}
