package selfstudy.y2025.m06.d10;

     class Person5 {
          String name;
          int age;

          Person5(String name, int age) {
               this.name = name;
               this.age = age;
          }

          void hello() {
               System.out.println("안녕하세요, 저는 " + name + "이고 나이는 " + age + "살입니다.");
          }
     }

     public class UseConstructureThis {
          public static void main(String[] args) {
               Person5 person = new Person5("하늘", 29);
               person.hello();
          }
     }
