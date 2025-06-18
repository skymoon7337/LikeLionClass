package til.y2025.m06.d13;

class Example {
    public int a = 1;
    protected  int b = 2;
    int c = 3;
    private int d = 4;
}

public class AccessModifierTest {
    public static void main(String[] args) {
        Example ex = new Example();

        System.out.println(ex.a);
        System.out.println(ex.b);
        System.out.println(ex.c);
       // System.out.println(ex.d);
    }
}

