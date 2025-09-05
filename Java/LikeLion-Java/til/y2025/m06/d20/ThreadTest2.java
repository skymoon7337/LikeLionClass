package til.y2025.m06.d20;

public class ThreadTest2 {
     public static void main(String[] args) {
          // 스레드 정의
          Thread t = new Thread(() -> {
               try {
                    System.out.println("스레드: 잠자기 시작 5000ms");
                    Thread.sleep(5000); // 5초 동안 잠
                    System.out.println("스레드: 5000ms가 지나서 잠에서 깸");
               } catch (InterruptedException e) {
                    System.out.println("스레드: InterruptedException 발생. 누가 Thread 깨움");
               }
          });

          // 스레드 시작
          t.start();

          // 메인 스레드는 2초 기다렸다가 t를 깨움
          try {
               Thread.sleep(2000); // 2초 대기
          } catch (InterruptedException e) {
               e.printStackTrace();
          }

          System.out.println("메인: 스레드 t를 interrupt로 깨운다");
          t.interrupt(); // 여기서 InterruptedException 발생 유도
     }
}
