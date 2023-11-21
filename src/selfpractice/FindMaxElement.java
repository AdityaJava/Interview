package selfpractice;

import java.util.*;
import java.util.stream.*;

public class FindMaxElement{
  public static void main(String args[]) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          int max =  myList.stream()
                           .max((a,b)->{return Integer.compare(a,b);})
                           .get();
          System.out.println(max);                    
  }
}
