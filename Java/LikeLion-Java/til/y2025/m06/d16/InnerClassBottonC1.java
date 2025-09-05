package til.y2025.m06.d16;

public class InnerClassBottonC1 {
     interface OnClickListener {
          void onClick();
     }

     private OnClickListener listener;

     public void setOnClickListener(OnClickListener listener) {
          this.listener = listener;
     }

     public void click() {
          if(listener != null) {
               listener.onClick();
          }
     }

     private class ClickHandler implements OnClickListener {
          @Override
          public void onClick() {
               System.out.println("Button was clicked!");
          }
     }

     public void simulate() {
          setOnClickListener(new ClickHandler());
          click();
     }

     public static void main(String[] args) {
          InnerClassBottonC1 btn = new InnerClassBottonC1();

          btn.simulate();
     }
}