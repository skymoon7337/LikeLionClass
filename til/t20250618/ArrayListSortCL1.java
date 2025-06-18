package til.t20250618;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortCL1 {
     public static void main(String[] args) {
          List<String> fruits = new ArrayList<>();

          fruits.add("Apple");
          fruits.add("Mango");
          fruits.add("Banana");
          fruits.add("Dragonfruit");
          fruits.add("Cherry");
          fruits.add("가");
          fruits.add("1");

          Collections.sort(fruits);

          for(String fruit:fruits){
               System.out.println(fruit);
          }

    }
}
