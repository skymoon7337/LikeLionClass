package til.y2025.m06.d16;


public class InnerC3 {
          String outerMessage = "Hello from Outer";

          class Inner {
               void showMessage() {
                    System.out.println(outerMessage);
               }
          }

          public static void main(String[] args) {
               InnerC3 make =new InnerC3();

               InnerC3.Inner inner = make.new Inner();

               inner.showMessage();
          }
     }


