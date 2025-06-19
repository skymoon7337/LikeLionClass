package til.y2025.m06.d19;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceRemoveCL1 {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);
        fruitPrices.put("배", 159320);
        fruitPrices.put("박", 159240);

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        System.out.println("끝");

        fruitPrices.replace("사과",10000);
        fruitPrices.remove("멜론");

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
