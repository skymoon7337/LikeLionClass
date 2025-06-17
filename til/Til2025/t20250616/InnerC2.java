package til.t20250616;

class CarC2 {
     String brand;
     Engine engine;

     public CarC2(String brand) {
          this.brand = brand;
          this.engine = new Engine();
     }

     class Engine {
          public void start() {
               System.out.println("The engine of " + brand + " is starting.");
          }
     }

     public void startEngine() {
          engine.start();
     }
}

public class InnerC2 {
     public static void main(String[] args) {
          CarC2 car = new CarC2("아우디");
          car.startEngine();
     }
}
