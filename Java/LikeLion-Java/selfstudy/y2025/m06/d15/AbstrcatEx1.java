package selfstudy.y2025.m06.d15;

abstract class Animal {
     String name;

     void sleep() {
          System.out.println("모두 잠을 자");
     }

     // 추상메서드 (자식 클래스가 반드시 구현)
     abstract void sound();
}

class DogEx1 extends Animal {
     @Override
     void sound() {
          System.out.println("개소리");
     }
}

class Cat extends Animal {
     @Override
     void sound() {
          System.out.println("냥소리");
     }
}

public class AbstrcatEx1 {
     public static void main(String[] args) {
          DogEx1 dog = new DogEx1();
          dog.sleep();      // 출력: 모두 잠을 자
          dog.sound();      // 출력: 개소리

          Cat cat = new Cat();
          cat.sleep();      // 출력: 모두 잠을 자
          cat.sound();      // 출력: 냥소리
     }
}