package til.t20250611;

public class PrintfTest {
    public static void main(String[] args) {
        int age=29;
        double pi=3.14159265358979323846;
        double pie=Math.PI;
        float flt=0.123456789f;
        boolean bl=true;

        System.out.printf("나이: %d \n원주율: %.8f \nfloat 정밀도 테스트: %.5f\n사실이냐: %b\n",age,pi,flt,bl);
        System.out.printf("%.20f",pie);
    }
}