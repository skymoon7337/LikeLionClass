package til.t20250616;

class CarC2{
     String brand;

     public CarC2(String brand){
          this.brand=brand;
     }

     class Engine{
          public void start(){
               System.out.println("The engine of "+brand+"is starting.");

          }
     }

     public void startEngine(){
          Engine engine = new Engine();
          engine.start();

     }
}



public class InnerC2 {
    public static void main(String[] args) {
         CarC2 car=new CarC2("아우디");
         car.startEngine();

    }
}
