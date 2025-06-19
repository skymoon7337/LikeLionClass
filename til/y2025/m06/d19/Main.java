package til.y2025.m06.d19;

import java.util.List;
import java.util.Arrays;

public class Main {

     public static void printElements(List<?> list) {
          for (Object o : list) {
               System.out.println(o);
          }
     }

     public static void main(String[] args) {
          List<Integer> numbers = Arrays.asList(1, 2, 3);
          List<String> words = Arrays.asList("A", "B", "C");

          printElements(numbers);
          printElements(words);
     }
}
