package til.y2025.m06.d23;

public class Annotation__SuppressWarnings1 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        java.util.List list = new java.util.ArrayList();

        list.add("Hello");
        list.add("World");

        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}