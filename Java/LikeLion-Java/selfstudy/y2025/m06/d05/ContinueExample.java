package selfstudy.y2025.m06.d05;

public class ContinueExample {
    public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {

             if (i == 5) {
                 System.out.println("continue 실행");
                 continue;
             }
             System.out.println("i = " + i);
         }
    }
}
