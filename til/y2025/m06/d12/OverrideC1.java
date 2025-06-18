package til.y2025.m06.d12;

class Animal{
     String name;

     public Animal(String name){
          this.name=name;
     }
     public void printName(){
          System.out.println("이름: "+name);
     }
}

class Dog extends Animal{
     String breed;

     public Dog(String name,String breed){
          super(name);
          this.breed=breed;
     }
     @Override
     public void printName() {
          super.printName();
          System.out.println("품종: " + breed);
     }
}


public class OverrideC1 {
    public static void main(String[] args) {
         Animal dog=new Dog("멍멍이","푸들");
         dog.printName();

    }
}
