package selfstudy.s20250616;

import java.util.Random;

public class SeedTest {
     public static void main(String[] args) {
          // 시드를 42로 고정한 랜덤 객체 2개 생성
          Random rand1 = new Random(42);
          Random rand2 = new Random(42);

          // 두 객체에서 같은 난수를 뽑아보기 (총 5개씩)
          System.out.println("rand1에서 생성된 난수:");
          for (int i = 0; i < 5; i++) {
               System.out.print(rand1.nextInt(100) + " ");
          }

          System.out.println("\nrand2에서 생성된 난수:");
          for (int i = 0; i < 5; i++) {
               System.out.print(rand2.nextInt(100) + " ");
          }
     }
}