package til.t20250613;

class Shape{
   double area(){
     return 0;
   }
}

class Circle extends Shape {
     double r;

     Circle(double radius) {
     this.r=radius;
     }

     @Override
     double area() {
          return Math.PI*r*r;
     }
}

class Rectangle extends Shape {
     double w, h;

     Rectangle(double width, double height) {
          this.w = width;
          this.h = height;
     }
     @Override
     double area() {
          return w * h;
     }

}

public class PolymorphismEx {
     public static void main(String[] args) {
          Shape[] shapes = new Shape[2];
          shapes[0] = new Circle(5);
          shapes[1] = new Rectangle(5, 5);

          for (Shape shape : shapes) {
               System.out.printf("면적: %.2f\n", shape.area());
          }
     }
}
