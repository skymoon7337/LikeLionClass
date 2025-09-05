package selfstudy.y2025.m06.d10;

class Person2 {
     String name;
     int age;

     void hello() {
          System.out.println("안녕하세요, 저는 " + name + "이고 나이는 " + age + "살입니다.");
     }
}

public class NoConstructure {
     public static void main(String[] args) {
          Person2 person = new Person2();
          person.name = "하늘";
          person.age = 29;

          person.hello();
     }
}