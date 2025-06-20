package til.y2025.m06.d20;

import java.util.Arrays;
import java.util.List;

public class StreamCL1 {
     public static void main(String[] args) {
          List<Integer> numbers= Arrays.asList(1,2,3,4,5);


          int result = numbers.stream()
                  .filter(n->n%2==0)
                  .mapToInt(Integer::intValue)
                  .sum();

          System.out.println(result);

//          System.out.println(result);
//          int sum=0;
//          for(int i=0; i<numbers.size(); i++)
//          if(numbers.get(i)%2==0)
//               sum+=numbers.get(i);
//

     }
}

