package til.y2025.m06.d17;

import java.util.Arrays;

public class MethodReferenceCL1 {
     public static void main(String[] args) {
          String[] names = {"Alice", "Bob", "Charlie"};

          //for each
          for(String name:names){
               System.out.println(name);
          }

          // 람다식 방식
          Arrays.stream(names).forEach(name -> System.out.println(name));

          // 메서드 참조 방식 (더 간단하게)
          Arrays.stream(names).forEach(System.out::println);
     }
}
