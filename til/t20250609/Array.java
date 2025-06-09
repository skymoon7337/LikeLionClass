package til.t20250609;

public class Array {
    public static void main(String[] args) {
         int[] numbers = {1,2,3,4,5};

         for(int i = numbers.length - 1; i >= 0; i--){
              System.out.println(numbers[i]);
         }

         for(int i = 0; i < numbers.length ; i++){
              System.out.println(numbers[numbers.length -1 -i]);
         }

    }
}
