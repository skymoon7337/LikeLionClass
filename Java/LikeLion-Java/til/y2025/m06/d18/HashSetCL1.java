package til.y2025.m06.d18;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetCL1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Kiwi");
        fruits.add("kiwi");

        for (String fruit: fruits) {
            System.out.println(fruit);

        }

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }

    }
}
