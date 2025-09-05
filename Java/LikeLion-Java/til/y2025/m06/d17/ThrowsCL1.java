package til.y2025.m06.d17;

public class ThrowsCL1 {
    public static void main(String[] args) {
        String strNum = "123a";

        try {
            int num = convertToInt(strNum);

            System.out.println("변환 결과: " + num);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류!");
        }



    }
    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
