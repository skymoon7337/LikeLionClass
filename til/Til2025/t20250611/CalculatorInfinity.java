package til.t20250611;
import java.util.Scanner;

public class CalculatorInfinity {
     public static void main(String[] args) {
          Scanner operator = new Scanner(System.in);
          double result;

          System.out.println("첫번째 숫자를 입력해 주세요");
          result = operator.nextDouble();

          while (true) {
               System.out.println("+,-,*,/ 중에 연산자를 입력해 주세요");
               char operation = operator.next().charAt(0);
               System.out.println("연산할 숫자를 입력해 주세요");
               double operand2 = operator.nextDouble();


               switch (operation) {
                    case '+':
                         result += operand2;
                         break;
                    case '-':
                         result -= operand2;
                         break;
                    case '*':
                         result *= operand2;
                         break;
                    case '/':
                         if (operand2 == 0)
                              System.out.println("0으로 나눌수 없습니다.");
                         else
                              result /= operand2;
                         break;
                    default:
                         System.out.println("유효(지원)하지 않는 연산자 입니다.");
                         continue;


               }

               System.out.printf("결과: %.4f\n", result);

          }
          // 종료코드와 operator.close(); 추가 필요
     }
}