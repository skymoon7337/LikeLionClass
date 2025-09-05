package til.y2025.m06.d19;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCL1 {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        for(Map.Entry<String, Integer> entry: fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
