package til.y2025.m06.d23;

class Animal1 {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Override1 {
    public static void main(String[] args) {
        Animal1 a=new Animal1();
        a.sound();

        Dog1 d=new Dog1();
        d.sound();

        Animal1 ad=new Dog1();
        ad.sound();
    }
}
