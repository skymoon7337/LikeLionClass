package til.t20250605;

public class Ascii_Unicode {
    public static void main(String[] args) {
         char asciiChar = 'A';
         System.out.println("Character: "+ asciiChar);

         int asciicode= (int) asciiChar;
         System.out.println("Asciicode: "+ asciicode);

        char kC = '가';
        System.out.println("Character: "+ kC);

        int unicode= (int) kC;
        System.out.println("Asciicode: "+ Integer.toHexString(unicode).toUpperCase());

    }
}
