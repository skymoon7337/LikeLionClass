package til.y2025.m06.d17;

class Util {
     public static void sayHello(String name) {
          System.out.println("Hello, " + name);
     }
}

@FunctionalInterface
interface A {
     public void say(String name);
}


public class LambdaEx1 {
    public static void main(String[] args) {
         // makes.M1_play_off_games.A a =(String name)->Util.sayHello(name);
            A a = Util::sayHello;

         a.say("h662");
    }
}
