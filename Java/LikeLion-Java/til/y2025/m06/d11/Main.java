package til.y2025.m06.d11;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

          while (true) {

               double number1 = 0;
               double number2 = 0;
               double result = 0;

               System.out.println("숫자를 입력해주세요 : ");
               number1 = scanner.nextDouble();

               System.out.println("연산자를 입력해주세요(+, -, *, /, C 그 외는 종료) : ");
               char operation = scanner.next().charAt(0);

               if (operation == 'C') {
                    System.out.println("계산기를 초기화합니다.");
                    continue;
               }

               System.out.println("숫자를 입력해주세요 : ");
               number2 = scanner.nextDouble();

               switch (operation) {
                    case '+':
                         result = number1 + number2;
                         break;
                    case '-':
                         result = number1 - number2;
                         break;
                    case '*':
                         result = number1 * number2;
                         break;
                    case '/':
                         if (number2 == 0) {
                              System.out.println("0으로 나눌 수 없습니다.");
                              continue;
                         }
                         result = number1 / number2;
                         break;
                    default:
                         System.out.println("계산기 종료");
                         return;
               }
               System.out.println(result);
               System.out.println("계산 완료");
               return;
          }
     }
}
