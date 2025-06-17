package til.t20250609;

public class MethodOverloading {
     public static int add(int a,int b){
          return a+b;
     }

     public static int add(int a,int b,int c){
          return a+b+c;
     }

    public static void main(String[] args) {
         System.out.println("a + b = " + add(1,2));
         System.out.println("a + b + c = " + add(1,2,4));
    }
}
