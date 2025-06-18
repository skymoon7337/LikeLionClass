package til.y2025.m06.d05;

public class MakeFunction {
    public static void info(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력===");
        info("Alice",20);
        info("Bob",22);
        info("Charlie",25);
    }
}
