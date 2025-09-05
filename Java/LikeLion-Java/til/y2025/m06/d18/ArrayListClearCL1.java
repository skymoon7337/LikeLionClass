package til.y2025.m06.d18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClearCL1 {
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

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
    }
}