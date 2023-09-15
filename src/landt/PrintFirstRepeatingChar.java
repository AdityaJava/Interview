package landt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintFirstRepeatingChar {
    public static void main(String[] args) {

        String str = "my name is aditya dudhal";
        List<String> strs = Arrays.asList(str.split(""));


        strs.stream().distinct().forEach(e -> System.out.println(e));
        List<String> strs1 = Arrays.asList("apple", "banana", "grapes", "banana");

        strs1.stream().distinct().forEach(e -> System.out.println(e));
    }
}
