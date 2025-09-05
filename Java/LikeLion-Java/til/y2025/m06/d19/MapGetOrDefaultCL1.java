package til.y2025.m06.d19;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefaultCL1 {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println(fruitPrices.getOrDefault("사과", 7000));
        System.out.println(fruitPrices.getOrDefault("포도", 5000));
        System.out.println(fruitPrices.get("사과"));
        System.out.println(fruitPrices.get("포도"));

    }
}

