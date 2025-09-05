package til.y2025.m06.d23;

class Calculator1 {
     /**
      * @deprecated Use {@link #addNumbers(int, int)} instead.
      */
     @Deprecated
     public int add(int a, int b) {
          return a + b;
     }

     /**
      * 두 수를 더합니다.
      *
      * @param a 첫 번째 정수
      * @param b 두 번째 정수
      * @return 두 수의 합
      */

     public int addNumbers(int a, int b) {
          return a + b;
     }
}

public class Deprecated1 {
     public static void main(String[] args) {
          Calculator1 cal=new Calculator1();

          System.out.println(cal.add(1,2));
          System.out.println(cal.addNumbers(1,2));
     }
}
