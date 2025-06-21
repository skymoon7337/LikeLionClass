package til.y2025.m06.d20;

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 실행 중");

        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);

                System.out.println(i);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1(),"CountThread");

        thread1.start();

        System.out.println(thread1.getName());
    }
}