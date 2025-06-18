package selfstudy.y2025.m06.d15;

/*
1         4         좌공백 3+ 우공백3 + 별 1
2        345        좌공백 2+ 우공백2 + 별 3
3       23456       좌공백 1+ 우공백1 + 별 5
4      1234567      좌공백 0+ 우공백0 + 별 7
5        345        좌공백 2+ 우공백2 + 별 3
6        345        좌공백 2+ 우공백2 + 별 3
7        345        좌공백 2+ 우공백2 + 별 3
 */


public class StarEx1_1  {
     public static void main(String[] args) {
          for (int i = 1; i < 8; i++) {
               int space;
               int count;

               if (i <= 4) {
                    space = 3 - (i-1);
                    count = 2 * (i-1) + 1;
               } else {
                    space = 2;
                    count = 3;
               }

               for (int s = 0; s < space; s++) {
                    System.out.print(" ");
               }

               for (int n = 0; n < count; n++) {
                    System.out.print("*");
               }

               for (int s = 0; s < space; s++) {
                    System.out.print(" ");
               }

               System.out.println();
          }
     }
}