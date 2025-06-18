package til.y2025.m06.d18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexOfCL1 {
     public static void main(String[] args) {
          List<String> fruits = new ArrayList<>();

          fruits.add("Mango");
          fruits.add("Bbanana");
          fruits.add("Apple");
          fruits.add("Tomato");
          fruits.add("Cherry");
          fruits.add("Banana");
          fruits.add("Potato");
          fruits.add("Dragonfruit");

          int index = fruits.indexOf("");
          System.out.println(index);
     }
}


