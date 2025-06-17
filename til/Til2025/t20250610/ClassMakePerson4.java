package til.t20250610;

public class ClassMakePerson4 {
     public static void main(String[] args) {
          Person4 p = new Person4();
          p.sayHello();

          Person4.sayGeneralGreeting();
     }
}

class Person4 {
     String name = "Alice";
     static String species = "Human";

     void sayHello() {
          String message = "Hello, my name is " + name;
          System.out.println(message);
     }

     static void sayGeneralGreeting() {
          String msg = "Hello! We are " + species + "s.";
          System.out.println(msg);
     }
}
