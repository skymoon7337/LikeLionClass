package til.y2025.m06.d18;
import java.util.*;


public class LinkedHashTreeSetCL1 {
    public static void main(String[] args) {

        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");


        for (String fruit:fruits) {
            System.out.println(fruit);
        }

        Set<String> fruitsTree = new TreeSet<>();

        fruitsTree.add("Banana");
        fruitsTree.add("Apple");
        fruitsTree.add("Cherry");


        for (String fruitTree:fruitsTree) {
            System.out.println(fruitTree);
        }


    }
}
