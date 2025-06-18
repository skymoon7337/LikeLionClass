package til.y2025.m06.d16;
interface Greeting {
     void greet();
}

public class AnonymousClassC1 {
     public static void main(String[] args) {
          Greeting greeting = new Greeting() {
               @Override
               public void greet() {
                    System.out.println("Hello from the anonymous class!");
               }
          };

          greeting.greet();
     }
}