package makes;

public class ButtonTest {

     // 인터페이스를 만들고 구현체를 통해 실행
     interface OnClickListener {
          void onClick();
     }

     // 구현체를 실제 저장할 필드
     private OnClickListener listener;

     // listener를 등록하는 setter
     public void setOnClickListener(OnClickListener listener) {
          this.listener = listener;
     }

     // 클릭되었을 때 listener가 설정되있으면 동작!
     public void click() {
          if (listener != null) {
               listener.onClick();
          }
     }

     // 내부 클래스: 외부와 강하게 결합되지 않음
     // 버튼 클릭시 실제 수행할 로직
     // 이게 람다식으로 표현 가능한 느낌
     private class ClickHandler implements OnClickListener {
          public void onClick() {
               System.out.println("Button was clicked!");    

          }
     }

     // 윗 블럭과 같음
//     public void simulate() {
//          setOnClickListener(() -> System.out.println("Button was clicked"));
//          click();
//     }

     // 테스트
     public void simulate() {
          setOnClickListener(new ClickHandler());
          click();
     }

     public static void main(String[] args) {
          ButtonTest btn = new ButtonTest();
          btn.simulate();
     }
}