package til.y2025.m06.d17;



public class TryCatchCL1 {
    public static void main(String[] args) {

         int a=10;
         int b=0;

         try {
              int result = a/b;
              System.out.println("Result: + result");
         } catch(ArithmeticException e){
              System.out.println("Error: " + e.getMessage());
              }

    }
}
