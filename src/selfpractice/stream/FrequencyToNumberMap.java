package selfpractice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyToNumberMap {
    public static void main(String[] args) {
        List<Integer> duplicates = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2);
        Map<Integer, Long> numToFreq = duplicates.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(numToFreq);
    }
}
