package til.t20250617;

public class TryCatchCL2 {
    public static void main(String[] args) {

         String input = "123";


         try{
              int number = Integer.parseInt(input);
              System.out.println("입력한 숫자는 "+number+" 입니다." );
         }
         catch(NumberFormatException e){
              System.out.println("숫자 포맷이 아니다.");
         }
    }
}
