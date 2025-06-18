package til.t20250617;

public class FinallyCL1 {
    public static void main(String[] args) {

         int a=10;
         int b=0;

         try{
              int result=a/b;
              System.out.println("Result: "+result);
         }
         catch(ArithmeticException e){
              System.out.println("Error: Division by zero.");
         }finally{
              System.out.println("Cleanup: fianlly는 항상 실행");

         }


    }
}
