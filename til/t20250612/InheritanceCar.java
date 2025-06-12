package til.t20250612;

class Vehicle {
     String brand;

     public Vehicle(String brand) {
          this.brand = brand;
     }

     public void display() {
          System.out.println("브랜드: " + brand);
     }
}

class Car extends Vehicle {
     String model;

     public Car(String brand, String model) {
          super(brand);
          this.model = model;
     }

     public void display() {
          System.out.println("브랜드: " + brand);
          System.out.println("모델: " + model);
     }
}

class Bike extends Vehicle {
     String model;

     public Bike(String brand, String model) {
          super(brand);
          this.model = model;
     }

     public void display() {
          System.out.println("브랜드: " + brand);
          System.out.println("모델: " + model);
     }
}

public class InheritanceCar {
     public static void main(String[] args) {
          Car car = new Car("아우디", "R8");
          car.display();

          Vehicle bike = new Bike("삼천리", "전동자전거");
          bike.display();
     }
}
