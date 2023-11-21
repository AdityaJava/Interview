package selfpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class ConcatenateStreams {
    public static void main(String[] args) {
 
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs","Java");
 
        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
         
        // Concatenated the list1 and list2 by converting them into Stream
 
        concatStream.forEach(System.out::println);
        // Printed the Concatenated Stream
         
    }
}
