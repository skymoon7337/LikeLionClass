package selfstudy.y2025.m06.d18;

import java.util.LinkedList;
import java.util.List;

public class LinkedListS1 {
     public static void main(String[] args) {
          List<String> fruits = new LinkedList<>();

          fruits.add("Apple");
          fruits.add("Banana");
          fruits.add("Cherry");

          System.out.println(fruits);

          fruits.add(1, "Orange");
          System.out.println(fruits);

          fruits.remove("Banana");
          System.out.println(fruits);
     }
}