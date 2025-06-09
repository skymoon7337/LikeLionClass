package til.t20250609;

public class StringMethod {
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