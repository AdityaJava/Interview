package stream;

import java.util.*;
import java.util.stream.Collectors;

//Find first duplicate using stream
//Here first duplicate is m
public class FindFirstDuplicate {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Krishna", "Vitthal", "Narayan", "Keshav", "Narayan", "Vitthal");

        Set<String> stringSet = new LinkedHashSet<>();

        List<String> duplicateStrings = strings.stream().filter(string -> !stringSet.add(string)).collect(Collectors.toList());
        System.out.println(duplicateStrings);
    }
}
