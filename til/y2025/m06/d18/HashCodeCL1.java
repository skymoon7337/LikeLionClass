package til.y2025.m06.d18;

import java.util.HashSet;
import java.util.Set;

public class HashCodeCL1
{
    public static void main(String[] args) {

         Set<String> fruits = new HashSet<>();

         fruits.add("Apple");
         fruits.add("Banana");

         for (String fruit:fruits) {
              System.out.println(fruit.hashCode());
         }
    }
}
