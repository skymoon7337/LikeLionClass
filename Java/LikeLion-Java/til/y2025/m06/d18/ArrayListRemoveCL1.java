package til.y2025.m06.d18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveCL1 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Dragonfruit");
        fruits.add("Cherry");
        fruits.add("가");
        fruits.add("1");

        fruits.remove("가");
        fruits.remove(5); // Arraylist는 크기 고정이 아니다


    }
}
