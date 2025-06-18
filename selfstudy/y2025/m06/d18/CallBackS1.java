package selfstudy.y2025.m06.d18;

interface Callback{
     void onDone();
}

class Worker{
     public void doWork(Callback cb) {
          System.out.println("작업 중");
          cb.onDone();
     }
}

public class CallBackS1 {
    public static void main(String[] args) {
         Worker w = new Worker();
         w.doWork(()-> System.out.println("작업 완료!"));


    }
}
