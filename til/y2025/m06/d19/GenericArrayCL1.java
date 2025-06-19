package til.y2025.m06.d19;

class BoxGA{
    public static <T> void displayArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }

}

public class GenericArrayCL1 {
    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5};
        String[] words={"사과","바나나","체리"};

        BoxGA.displayArray(numbers);
        BoxGA.displayArray(words);
    }
}
