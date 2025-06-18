package til.y2025.m06.d18;

import java.util.List;
import java.util.ArrayList;

public class ArrayListCL1 {
    public static void main(String[] args) {
         List<String> fruits = new ArrayList<>();

         fruits.add("Apple");
         fruits.add("Banana");
         fruits.add("Cherry");
         fruits.add("Dragonfruit");
         fruits.add("Mango");

//          for(int i=0; i<fruits.size(); i++){
//               System.out.println(fruits.get(i));
//          }

          for(String fruit: fruits){
               System.out.println(fruit);
          }
//
//         Iterator<String> it = fruits.iterator();
//         while (it.hasNext()) {
//              String item = it.next();
//              System.out.println(item);

         }
    }

