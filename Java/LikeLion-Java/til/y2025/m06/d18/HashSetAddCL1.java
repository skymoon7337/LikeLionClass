package til.y2025.m06.d18;

import java.util.*;

public class HashSetAddCL1 {
    public static void main(String[] args) {

         List<String> listFruits = new ArrayList<>();
         Set<String> fruits = new HashSet<>();

         listFruits.add("Apple");
         listFruits.add("Apple");

         fruits.add("Banana");
         fruits.add("Banana");
         fruits.add("banana");

         for (String listFruit: listFruits) {
              System.out.println(listFruit);
         }

         for (String fruit:fruits) {
              System.out.println(fruit);
         }

    }
}
