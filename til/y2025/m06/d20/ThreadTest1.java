package til.y2025.m06.d20;

class MyThreadC1 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread: " + i);

            try{
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {
        MyThreadC1 thread= new MyThreadC1();

        thread.start();
    }
}
