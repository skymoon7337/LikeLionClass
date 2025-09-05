package til.y2025.m06.d19;

import java.util.ArrayList;
import java.util.List;

class BoxGL {
     public static <T> void displayArray(List<T> array) {
          for(T element: array) {
               System.out.println(element);
          }
     }
}

public class GenericListCL1 {
     public static void main(String[] args) {
          List<Integer> numbers = List.of(1, 2, 3, 4, 5);

          List<String> words = new ArrayList<>();
          words.add("apple");
          words.add("banana");
          words.add("cherry");

          BoxGL.displayArray(numbers);
          BoxGL.displayArray(words);
     }
}

