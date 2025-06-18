package til.y2025.m06.d16;

interface Calculator {
     int compute(int a, int b);
}

public class CalculatorAnnoC1 {
    public static void main(String[] args) {
         Calculator mul = new Calculator() {
              @Override
              public int compute(int a, int b) {
                   return a * b;
              }
         };

         System.out.println(mul.compute(3, 4));

    }
}
