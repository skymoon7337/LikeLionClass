package til.y2025.m06.d23;

class ReflectionDemo1{
     private String secret="비밀";

     public ReflectionDemo1(){
          System.out.println("ReflectionDemo 생성자 실행");
     }

     public String greet(String name){
         return "Hello, "+name;
     }

    private String reveal(String code) {
        return "Access granted to: " + code;
    }
}

public class Reflection1 {
    public static void main(String[] args) {
        ReflectionDemo1 redemo=new ReflectionDemo1();



    }
}
