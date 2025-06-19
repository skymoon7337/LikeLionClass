package til.y2025.m06.d19;

import java.util.ArrayList;
import java.util.List;

class BoxGATL {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class GenericArrayCL1ToList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        BoxGATL.displayArray(numbers);
        BoxGATL.displayArray(words);


    }
}


