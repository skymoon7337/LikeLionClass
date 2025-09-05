package til.y2025.m06.d13;

interface AnimalC1{
     void makeSound();

}

class DogC1 implements AnimalC1 {
     @Override
     public void makeSound() {
          System.out.println("멍");
     }
}

public class InterfaceC1 {
    public static void main(String[] args) {
     AnimalC1 dog= new DogC1();

     dog.makeSound();
    }
}
