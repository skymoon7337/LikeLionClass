package selfstudy.s20250617;

public class TryCatchS1 {
     public static void main(String[] args) {

          String[] arr = {"10", "0", "hello"};

          for (String item : arr) {
               try {
                    int num = Integer.parseInt(item);
                    int result = 100 / num;
                    System.out.println("결과: " + result);
               } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
               } catch (NumberFormatException e) {
                    System.out.println("숫자로 변환할 수 없습니다: " + e.getMessage());
               }

               System.out.println("----- 다음 반복 -----");
          }

          System.out.println("프로그램 종료");
     }
}

