package selfstudy.y2025.m06.d16;

class Outer {
private String secret = "비밀";


private class Inner {
     void reveal() {
          System.out.println("내부에서 접근한 값: " + secret);
     }
}

public void showSecret() {
     Inner inner = new Inner();
     inner.reveal();
}

}


public class InnerPrivateEx1 {
     public static void main(String[] args) {
          Outer outer = new Outer();
          outer.showSecret();

          // 아래 코드는 컴파일 오류 발생! (private Inner 접근 불가)
          // Outer.Inner inner = outer.new Inner();
     }
}