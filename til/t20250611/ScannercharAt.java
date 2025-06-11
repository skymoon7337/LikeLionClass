package til.t20250611;

import java.util.Scanner;

public class ScannercharAt {
    public static void main(String[] args) {

         System.out.println("첫글자는 무엇일까요?");
         Scanner scanner= new Scanner(System.in);
         char name=scanner.next().charAt(0);
         System.out.println("첫글자는: "+name);

    }
}