package til.y2025.m06.d20;

class SumRunnableAS implements Runnable {
     private final int[] numbers;

     public SumRunnableAS(int[] numbers) {
          this.numbers = numbers;
     }

     @Override
     public void run() {
          int sum = 0;

          for(int n: numbers) {
               sum += n;

               try {
                    Thread.sleep(1000);
               } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
               }
          }

          System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);
     }
}

public class ThreadArraySum1 {
     public static void main(String[] args) {
          int[][] dataSets = {
                  {1, 2, 3, 4, 5},
                  {10, 20, 30},
                  {7, 14, 21, 28},
                  {100, 200, 300, 400}
          };

          for(int i=0; i<dataSets.length;i++){
               Thread sumThread = new Thread(new SumRunnableAS(dataSets[i]));
               sumThread.start();
          }
          System.out.println("All threads started.");
     }
}