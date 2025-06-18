package til.y2025.m06.d18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetSetCL1 {
     public static void main(String[] args) {
          List<String> fruits = new ArrayList<>();

          fruits.add("Mango");
          fruits.add("banana");
          fruits.add("Apple");
          fruits.add("Tomato");
          fruits.add("Cherry");
          fruits.add("Banana");
          fruits.add("Potato");
          fruits.add("Dragonfruit");

          fruits.set(1, "Orange");
          System.out.println(fruits.get(1));
     }
}


