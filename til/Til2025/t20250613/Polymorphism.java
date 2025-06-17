package til.t20250613;

class Animal{
     public void makeSound(){
          System.out.println();
     }
}

class Dog extends Animal{
     @Override
     public void makeSound(){
          System.out.println("멍");
     }
}

class Cat extends Animal{
     @Override
     public void makeSound(){
          System.out.println("냥");
     }
}

class Bird extends Animal{
     @Override
     public void makeSound(){
          System.out.println("짹");
     }
}

class Quokka extends Animal{
     @Override
     public void makeSound(){
          System.out.println("쿼");
     }
}

public class Polymorphism {
    public static void main(String[] args) {
         Animal a1=new Dog();
         Animal a2=new Cat();
         Animal a3=new Bird();
         Animal a4=new Quokka();

         Animal[] animals={a1,a2,a3,a4};

         for (int i = 0; i < animals.length; i++) {
              animals[i].makeSound();

         //for (Animal animal : animals) {
           // animal.makeSound();
        }

    }
}
