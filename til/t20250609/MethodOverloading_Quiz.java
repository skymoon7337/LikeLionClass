package til.t20250609;

public class MethodOverloading_Quiz {
     public static void greet() {
          System.out.println("Hello World");
     }

     public static void greet(String name) {
          System.out.println("Hello " + name);
     }

     public static void greet(int age,String name) {
          System.out.println("Hello "+ age+ "살 " + name);
     }

     public static void main(String[] args) {
          greet();
          greet("Alice");
          greet(23,"Bob");
     }
}
