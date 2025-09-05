package til.y2025.m06.d13;

abstract class AnimalC3{
     abstract void makeSound();

     public void sleep(){
          System.out.println("잔다");
     }
}

class DogC3 extends AnimalC3 {
     @Override
     void makeSound() {
          System.out.println("멍");
     }
}

public class AbstractClassesC1 {
    public static void main(String[] args) {
         AnimalC3 dog = new DogC3();

         dog.makeSound();
         dog.sleep();
    }
}
