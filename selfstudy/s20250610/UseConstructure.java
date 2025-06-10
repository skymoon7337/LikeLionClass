package selfstudy.s20250610;

class Person3 {
     String name;
     int age;

     Person3(String inputName, int inputAge) {
          name = inputName;
          age = inputAge;
     }

     void hello() {
          System.out.println("안녕하세요, 저는 " + name + "이고 나이는 " + age + "살입니다.");
     }
}

public class UseConstructure {
     public static void main(String[] args) {
          Person3 person = new Person3("하늘", 29);
          person.hello();
     }
}
