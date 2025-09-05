package selfstudy.y2025.m06.d18;
import java.util.*;

public class ArrayListSortByUser1 {
    public static void main(String[] args) {

         List<Integer> numbers = new ArrayList<>(List.of(5, 2, 9, 1, 4));
       //  List<타입> 변수명 = new ArrayList<>(List.of(값1, 값2, 값3));

         Collections.sort(numbers);
         System.out.println("오름차순 정렬: " + numbers);


         numbers.sort(null);
         System.out.println("오름차순 정렬: " + numbers);

        numbers.sort((a, b) -> a - b);
        System.out.println("오름차순 정렬: " + numbers);


         numbers.sort((a, b) -> b - a);
         System.out.println("내림차순 정렬: " + numbers);
    }
}




