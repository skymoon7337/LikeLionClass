package til.t20250610;

class Person1{
    String name;
    int age;
    String MBTI;

    public void sayHello(){
        System.out.println("안녕하세요 저는 " + name + "입니다. 저의 나이는 " + age + "살 입니다. 저의 MBTI는 "+ MBTI + "입니다");
    }
    public void work(){
        System.out.println("일하는중...");
    }
    public void study(){
        System.out.println("공부하는중...");
    }

}

public class ClassMakePerson1 {
    public static void main(String[] args) {
        Person1 person= new Person1();

        person.name="문하늘";
        person.age=29;
        person.MBTI="ENTJ";
        person.study();
        person.sayHello();

        person.name="홍성현";
        person.age=25;
        person.MBTI="ENFP";
        person.work();
        person.sayHello();
    }
}
