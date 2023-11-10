package week6.Generics.Task1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SumEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int[] result = sumEvenOdd(numbers);
        System.out.println("Sum of Even Numbers: " + result[0]);
        System.out.println("Sum of Odd Numbers: " + result[1]);
    }

    public static <T extends Number> int[] sumEvenOdd(List<T> numbers){
        int sumEven = 0;
        int sumOdd = 0;

        for (T number : numbers){
            int num = number.intValue();

            if(num % 2 == 0){
                sumEven += num;
            } else{
                sumOdd += num;
            }
        }
        return new int[]{sumEven, sumOdd};
    }
}
