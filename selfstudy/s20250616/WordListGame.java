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
        Scanner scanner = new Scanner(System.in);
        String answer = pickRandomWord();
        System.out.println("정답(디버그용): " + answer);
        System.out.println("=== Wordle 게임 ===");
        System.out.println("5글자 단어를 맞춰보세요. 총 6번의 기회가 있습니다.");
        System.out.println("C: 정확한 위치, W: 단어에는 있으나 위치 불일치, N: 단어에 없음");

        for (int attempt=1; attempt<=MAX_ATTEMPTS;attempt++){
            String guess;

            while (true){
                System.out.print("\n[" + attempt + "/" + MAX_ATTEMPTS + "] 추측> ");
                guess=scanner.nextLine().trim().toUpperCase();
                if(guess.length()==WORD_LENGTH){
                    break;
                }
                System.out.println("5글자 영어 단어를 입력하세요.");

            }
            System.out.println("남은 시도 횟수: "+(MAX_ATTEMPTS-attempt)+", 입력한 단어: "+guess);
        }
    }

    public static String pickRandomWord() {
        Random rand = new Random();

        return WORD_LIST[rand.nextInt(WORD_LIST.length)];
    }
}