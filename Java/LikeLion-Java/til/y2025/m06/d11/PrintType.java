package til.y2025.m06.d11;

public class PrintType {
    public static void main(String[] args) {

        String name = "Son";
        int backNumber=7;
        Integer box=backNumber;

        System.out.println(box.getClass().getName());
        System.out.println((name+backNumber).getClass().getName());

    }
}