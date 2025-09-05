package til.y2025.m06.d10;

class Car0 {
     String brand;
     int year;
     String fuel;
     public void sayMyCar() {
          System.out.println("내 차의 브랜드는 " + brand + "이고 연식은 " + year + "입니다. 연료는 "+fuel+ "입니다.");
     }
}

public class ClassMakeCar {
     public static void main(String[] args) {

          Car0 car = new Car0();

          car.brand = "아우디";
          car.year = 2023;
          car.fuel="기름";
          car.sayMyCar();
     }
}

