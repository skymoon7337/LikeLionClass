package til.t20250612;

class Animal {
     String name;

     public Animal(String name) {
          this.name = name;
     }

     public void printName() {
          System.out.println("Animal name: " + name);
     }
}

class Dog extends Animal {
     String breed;

     public Dog(String name, String breed) {
          super(name);
          this.breed = breed;
     }
}

public class InheritanceC1 {
     public static void main(String[] args) {
          Dog dog = new Dog("뽀뽀", "말티즈");

          dog.printName("쿠키");
     }
}