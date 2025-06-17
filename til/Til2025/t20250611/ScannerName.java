package til.t20250611;

import java.util.Scanner;

public class ScannerName {
    public static void main(String[] args) {

        System.out.println("성과 이름을 띄워서 입력해주세요");
        Scanner scanner= new Scanner(System.in);
        String name=scanner.next();
        System.out.println("성: "+name);

        String name2=scanner.next();
        System.out.println("이름: "+name2);
    }

}