package til.y2025.m06.d09;

public class StringMethodChangeIf {
     public static void main(String[] args) {
          String message = "Hello,Java!";
          char target = 'a';

          for (int i = 0; i < message.length(); i++) {
               if (message.charAt(i) == target) {
                    System.out.println(i);
                    break;
               }
          }
     }
}