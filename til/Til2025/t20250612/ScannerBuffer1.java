package til.t20250612;
import java.util.Scanner;


public class ScannerBuffer1 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("나이를 입력: ");
          int age= scanner.nextInt();

          scanner.nextLine();

          System.out.println("이름을 입력: ");
          String name = scanner.nextLine();

          System.out.printf("나이 %d,이름 %s",age,name);



     }
}