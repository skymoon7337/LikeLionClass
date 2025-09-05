package til.y2025.m06.d18;

import java.util.Map;
import java.util.HashMap;

public class MapKVCL1 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue() + " 원.");
        }

        int sum = 0;

        for (int fruitprices : fruitPrices.values()) {
            sum += fruitprices;
        }

        System.out.println("Sum of fruit price is: " + sum / fruitPrices.size());
    }
}



