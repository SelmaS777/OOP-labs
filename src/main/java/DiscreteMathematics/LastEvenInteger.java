package DiscreteMathematics;

public class LastEvenInteger {
    public static int lastEvenIndex(int[] numbers){
        int lastIndex = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                lastIndex = i;
                found = true;
            }
        }
        if (found){
            return lastIndex + 1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] myList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lastIndex = lastEvenIndex(myList);

        if (lastIndex != 0){
            System.out.println("Position of the last even integer: " + lastIndex);
        } else{
            System.out.println("There are no even integers in the list.");
        }
    }
}
