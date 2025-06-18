package til.y2025.m06.d10;

class Person0 {
    String name;
    int age;

    public void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "이고 나이는 " + age + "살입니다.");
    }
}

public class ClassMakePerson0 {
    public static void main(String[] args) {
        Person0 person = new Person0();

        person.name="하늘";
        person.age=29;

        person.sayHello();
    }
}