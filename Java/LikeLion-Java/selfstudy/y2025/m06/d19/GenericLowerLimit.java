package selfstudy.y2025.m06.d19;

import java.util.*;

public class GenericLowerLimit {

     public static void addValues(List<? super Integer> list) {
          list.add(10);
          list.add(20);

          for (Object obj : list) {
               System.out.println("추가된 값: " + obj);
          }
     }

     public static void main(String[] args) {
//        List<Byte> byteList = new ArrayList<>();
          List<Object> objList = new ArrayList<>();
          List<Number> numList = new ArrayList<>();
          List<Integer> intList = new ArrayList<>();

//          불가능
//          System.out.println("[byte 리스트]");
//          addValues(byteList);

          System.out.println("[Object 리스트]");
          addValues(objList);

          System.out.println("\n[Number 리스트]");
          addValues(numList);

          System.out.println("\n[Integer 리스트]");
          addValues(intList);
     }
}