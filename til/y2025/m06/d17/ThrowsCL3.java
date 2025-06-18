package til.y2025.m06.d17;

public class ThrowsCL3 {
     public static void main(String[] args) {
          String test = "11,11";

          try {
               int result = multiply(test);
               System.out.println(result);
          } catch (NumberFormatException e) {
               System.out.println(e.getMessage());
               System.out.println("에러!");
          }
     }

     public static int multiply(String input) throws NumberFormatException {
          String[] splitInput = input.split(",");
          int[] results = new int[2];

          for(int i = 0; i < splitInput.length; i++) {
               results[i] = Integer.parseInt(splitInput[i]);
          }

          return results[0] * results[1];
     }

}
