package selfpractice.stream;

import java.util.*;
//Find first duplicate using stream
//Here first duplicate is m
public class FindFirstDuplicate {
    public static void main(String[] args) {
        String s = "my name is Aditya";
        List<String> strings = Arrays.asList(s.split(""));

        Set<String> stringSet = new HashSet<>();

        Optional<String> stringOptional =  strings.stream().filter(s1 -> stringSet.add(s1)).findFirst();
        System.out.println(stringOptional.get());

    }
}
