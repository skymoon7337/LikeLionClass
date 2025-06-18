package til.y2025.m06.d18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSublistCL1 {
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

         List<String> subFruits = fruits.subList(0, 2); // 0<= 범위 <2

         for(String subFruit: subFruits) {
              System.out.println(subFruit);

         }
    }
}
