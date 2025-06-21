package til.y2025.m06.d20;

class SumRunnable2 implements Runnable {
     private final int[] numbers;

     public SumRunnable2(int[] numbers) {
          this.numbers = numbers;
     }

     @Override
     public void run() {
          int sum=0;

          for(int n: numbers) {
               sum += n;

               try {
                    Thread.sleep(1000);
               } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
               }
          }
     }
}


public class ThreadArray1 {
    public static void main(String[] args) {
    }
}

//2. int[][] dataSets 데이터셋은 이중배열인데 왜 그냥 배열로 만들었을까요?
//쓰레드로 배열 각각 계산하기 위해