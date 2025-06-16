package selfstudy.s20250616;
import java.util.Scanner;
import java.util.Random;

public class WordListGame {
    private static final String[] WORD_LIST = {
            "APPLE", "BRAIN", "CRANE", "DREAM", "EAGLE",
            "FRAME", "GRACE", "HOUSE", "INPUT", "JUDGE"
    };
    private static final int MAX_ATTEMPTS = 6;
    private static final int WORD_LENGTH = 5;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String answer = pickRandomWord();
        System.out.println("정답(디버그용): " + answer);
    }

    public static String pickRandomWord() {
        Random rand = new Random();

        return WORD_LIST[rand.nextInt(WORD_LIST.length)];
    }
}