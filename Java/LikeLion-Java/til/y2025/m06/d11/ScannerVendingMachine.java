package til.y2025.m06.d11;

import java.util.Scanner;

public class ScannerVendingMachine {
    public static void main(String[] args) {
         System.out.println("---메뉴를 고르세요 (숫자만 입력해 주세요)  ---");
         System.out.println("1:멜론소다 (1000원)");
         System.out.println("2:콜라 (2000원)");
         System.out.println("3:사이다 (3000원)");
         System.out.println("4:환타 (4000원) ");
         System.out.println("5:커피 (5000원)");


         Scanner scanner= new Scanner(System.in);

         int choice = scanner.nextInt();
         String item="";
         int price = 0;


          switch (choice){
               case 1:
                    item="멜론소다";
                    price=1000;
                    break;
               case 2:
                    item="콜라";
                    price=2000;
                    break;
               case 3:
                    item="사이다";
                    price=3000;
                    break;
               case 4:
                    item="환타";
                    price=4000;
                    break;
               case 5:
                    item="커피";
                    price=5000;
                    break;
               default:
                    System.out.println("다시 고르세요");
                    return;
          }
         System.out.println(item+"을 고르셨습니다. " + price+"원 입니다.\n금액을 넣어주세요: ");

          int money=scanner.nextInt();

          while (money<price){
               System.out.println("잔액이 모자랍니다. 돈을 더 넣어주세요.");
               int extraMoney = scanner.nextInt();
               money+=extraMoney;
          }

         int change=money-price;
         System.out.println(item+"가 나옵니다. 잔액:"+change+"원이 나옵니다.");

    }
}