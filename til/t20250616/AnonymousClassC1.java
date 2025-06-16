package til.t20250616;

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