package selfstudy.y2025.m06.d15;

public class StarEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            int star;

            if (i <= 4) {
                star = 2 * (i-1) + 1;
            } else {
                star = 3;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

                System.out.println();

        }
    }
}