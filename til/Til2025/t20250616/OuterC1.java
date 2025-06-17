package til.t20250616;

class Outer1{
     private class HiddenInner{
          void secret(){
               System.out.println("비밀");
          }
     }

     public void reveal() {
          HiddenInner hi = new HiddenInner(); // 이거 없으면 secret() 호출 불가
          hi.secret();
     }
}

public class OuterC1 {
    public static void main(String[] args) {

         Outer1 outer = new Outer1();
         outer.reveal();

    }
}
