package til.t20250609;

public class ArraySum {
     public static void main(String[] args) {

          int[] numbers = {2, 4, 6, 8, 10};
          int sum = 0;

          for (int i = 0; i < numbers.length; i++) {
               sum += numbers[i];
          }

          System.out.println("배열의 총 합은: " + sum);
     }
}