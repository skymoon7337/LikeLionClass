package til.y2025.m06.d23;

import java.lang.reflect.*;

class Person {
    private String name = "비밀이야";

    public void sayHello(String to) {
        System.out.println("안녕, " + to );
    }

    private void whisper(String msg) {
        System.out.println("(귓속말)" + msg);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 1. 클래스 정보 가져오기
        Class<?> clazz = Person.class;
        System.out.println("클래스 이름: " + clazz.getName());

        // 2. 객체 생성 (기본 생성자 사용)
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 3. private 필드 접근
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true); // private 무시하고 접근 허용
        System.out.println("원래 name 필드 값: " + nameField.get(obj));
        nameField.set(obj, "리플렉션에선 비밀이 아닌데?"); // 필드 값 수정
        System.out.println("수정된 name 필드 값: " + nameField.get(obj));

        // 4. public 메서드 호출
        Method helloMethod = clazz.getMethod("sayHello", String.class);
        helloMethod.invoke(obj, "철수");

        // 5. private 메서드 호출
        Method whisperMethod = clazz.getDeclaredMethod("whisper", String.class);
        whisperMethod.setAccessible(true);
        whisperMethod.invoke(obj, " 리플랙션에선 귓속말 볼 수 있는데?...");
    }
}
