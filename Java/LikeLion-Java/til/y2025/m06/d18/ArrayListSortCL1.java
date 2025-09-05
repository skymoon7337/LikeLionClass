package til.y2025.m06.d18;

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

          if(fruits.contains("Apple")) {
               System.out.println("Apple은 포함되어 있습니다.");
          }


          if(fruits.contains("apple")) {
               System.out.println("Apple은 포함되어 있습니다.");
          }

          if(fruits.contains("나")) {
               System.out.println("나는 포함되어 있지 않습니다.");
          }

    }
}
