package week6.Generics.Task2;

import java.util.ArrayList;
import java.util.List;

public class Reversed {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Apple");
        elements.add("Banana");
        elements.add("Peach");
        elements.add("Berry");
        elements.add("Cherry");

        List<String> result = reversed(elements);
        System.out.println(result);
    }
    public static <T> List<T> reversed(List<T> elements){
        List<T> reversedArray = new ArrayList<>();
        for (int i = elements.size() - 1; i >= 0; i--){
            reversedArray.add(elements.get(i));
        }
        return reversedArray;
    }
}
