package til.y2025.m06.d16;

public class InnerC1 {
     private String message="안녕 from outer class";

     class InnerClassC1{
          void displayMessage(){
               System.out.println("Inner says: " + message);
          }
     }

     public void callInner(){
          InnerClassC1 inner=new InnerClassC1();
          inner.displayMessage();
     }


    public static void main(String[] args) {
         InnerC1 outer = new InnerC1();

          outer.callInner();


    }
}
