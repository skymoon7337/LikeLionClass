package til.y2025.m06.d20;

import java.util.*;

public class StreamAverage1 {
    public static void main(String[] args) {
         List<Double> values = Arrays.asList(10.0, 20.0, 30.0);
         double avg= values.stream()
                 .mapToDouble(Double::doubleValue)
                 .average()
                 .orElse(0.0);

         System.out.println(avg);
    }
}
