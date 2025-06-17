package til.t20250617;

public class ThrowsCL2 {
          public static void main(String[] args) {
               String input = "100";

               try {
                    boolean result = validateTokenCount(input);

                    if (result) {
                         System.out.println("숫자 2개");
                    }
               } catch(NumberFormatException e) {
                    System.out.println(e.getMessage());
               }

          }

          public static boolean validateTokenCount(String tokens) throws NumberFormatException {
               if (tokens.length() != 2) {
                    throw new NumberFormatException("숫자 2개가 아닙니다.");
               }

               return true;
          }
     }