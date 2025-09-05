package codingTest.likeLion;

public class ez2 {
     public static int getProductAbs(int x, int y) {
          int result = x * y;
          return (result < 0) ? -result : result;
          // 여기에 코드를 작성해 주세요.
     }

     public static void main(String[] args) {
          System.out.println(getProductAbs(10, 20));      // 200
          System.out.println(getProductAbs(20, -40));     // 800
     }
}