package til.t20250616;

class PersonC1{
     public static void greet(){
          System.out.println("Hello from static method");
     }

     public void sayHello(){
          System.out.println("안녕 from instance method");

     }

}
public class StaticC1 {
     public static void main(String[] args) {
          PersonC1.greet();

          PersonC1 p = new PersonC1();
          p.sayHello();
          p.greet();
     }
}
