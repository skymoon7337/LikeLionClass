package til.t20250612;

class Animal2 {
    String name;

    public Animal2(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Lion2 extends Animal2 {
    public Lion2(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("어흥!");
    }
}

class Cat2 extends Animal2 {
    public Cat2(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}

public class InheritanceAnimal {
    public static void main(String[] args) {
        Lion2 lion = new Lion2("심바");
        Cat2 cat = new Cat2("나비");

        lion.makeSound();  // 어흥!
        cat.makeSound();   // 야옹~
    }
}


