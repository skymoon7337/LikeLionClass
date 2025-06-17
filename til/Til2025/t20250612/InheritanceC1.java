package til.t20250612;

class Animal3 {
     String name;

     public Animal3(String name) {
          this.name = name;
     }

     public void printName() {
          System.out.println("Animal name: " + name);
     }
}

class Dog3 extends Animal3 {
     String breed;

     public Dog3(String name, String breed) {
          super(name);
          this.breed = breed;
     }
}

public class InheritanceC1 {
     public static void main(String[] args) {
          Dog3 dog = new Dog3("뽀뽀", "말티즈");

          dog.printName();
     }
}