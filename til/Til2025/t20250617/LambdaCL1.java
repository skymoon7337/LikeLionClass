package til.t20250617;

@FunctionalInterface
interface MathOperation{
     int operate(int a,int b);
}


public class LambdaCL1 {
    public static void main(String[] args) {

        MathOperation add=(int a,int b) -> a+b;
        MathOperation multiply=(int a,int b) -> a*b;
        System.out.println(add.operate(5,7));
        System.out.println(multiply.operate(5,7));
    }
}
