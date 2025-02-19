package setbasedproblems.MissingNumberInAnArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissing(arr, 5)); // Output: 3
    }

    private static Integer findMissing(int[] arr, int i) {
        int sum = (i * (i + 1)) / 2;
        Integer actualSum = Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue));
        Arrays.stream(arr).boxed().collect(Collectors.summingInt(n -> n.intValue())); //This is valid and more intuiting
        return sum - actualSum;
    }
}
