package selfstudy.s20250615;


interface Soundable {
     void sound();
}

interface Movable {
     void move();
}

class Dog implements Soundable, Movable {
     @Override
     public void sound() {
          System.out.println("멍멍");
     }

     @Override
     public void move() {
          System.out.println("달린다");
     }
}

public class InterfaceS1 {
     public static void main(String[] args) {
          Dog dog = new Dog();
          dog.sound();  // 출력: 멍멍
          dog.move();   // 출력: 달린다
     }
}