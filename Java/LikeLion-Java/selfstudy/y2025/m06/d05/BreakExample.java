package selfstudy.y2025.m06.d05;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);

                if (i == 5) {
                    System.out.println("break 실행");
                    break;
                }
        }

    }
}

