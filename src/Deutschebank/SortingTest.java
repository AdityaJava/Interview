package Deutschebank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,1,2,78,34,78,987);
        integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
