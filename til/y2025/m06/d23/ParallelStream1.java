package til.y2025.m06.d23;

class SumThread1 extends Thread {
    private int[] array;
    private int start, end;
    private int partialSum = 0;

    public SumThread1(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run (){
        for (int i=start; i<end;i++){
            partialSum+=array[i];
        }
    }

    public int getPartialSum(){
        return partialSum;
    }
}


public class ParallelStream1 {
    public static void main(String[] args) {

      int[] numbers=new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

      int numThreads=4;
      int chunkSize=numbers.length/numThreads;

      SumThread1[] threads= new SumThread1[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? numbers.length : start + chunkSize;

            threads[i] = new SumThread1(numbers, start, end);
            threads[i].start();
        }

      int totalSum=0;
        try{
            for (SumThread1 thread1:threads){
                thread1.join();

                int threadResult= thread1.getPartialSum();
                totalSum += thread1.getPartialSum();
                System.out.printf("현재 쓰레드의 총합: %d\n",threadResult);
            }
        }
        catch  (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("Total sum: %d\n",totalSum );
    }


}
