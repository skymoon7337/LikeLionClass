package til.t20250611;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            Scanner operator=new Scanner(System.in);



            System.out.println("첫번째 숫자를 입력해 주세요");
            double operand1=operator.nextDouble();
            System.out.println("+,-,*,/ 중에 연산자를 입력해 주세요");
            char operation=operator.next().charAt(0);
            System.out.println("두번째 숫자를 입력해 주세요");
            double operand2=operator.nextDouble();

            double result=0;

            switch(operation){
                case '+':
                    result=operand1+operand2;
                    break;
                case '-':
                    result=operand1-operand2;
                    break;
                case '*':
                    result=operand1*operand2;
                    break;
                case '/':
                    if (operand2==0)
                        System.out.println("0으로 나눌수 없습니다.");
                    else
                        result=operand1/operand2;
                    break;
                default:
                    System.out.println("유효(지원)하지 않는 연산자 입니다.");
                    return;


            }

            System.out.printf("결과: %.4f\n", result);
        }
    }
    //상속과 super 오버라이딩 @오버라이드 어노테이션