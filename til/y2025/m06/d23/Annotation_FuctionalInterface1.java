package til.y2025.m06.d23;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);

//    void anotherMethod();
}

public class Annotation_FuctionalInterface1 {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Alice");
    }
}