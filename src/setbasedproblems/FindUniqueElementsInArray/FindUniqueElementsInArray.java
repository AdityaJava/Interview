package setbasedproblems.FindUniqueElementsInArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(findUnique(arr)); // Output: [1, 2, 3, 4, 5]
    }

    private static List<Integer> findUnique(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        return Arrays.stream(arr).boxed().collect(Collectors.toSet()).stream().collect(Collectors.toList());
    }
}
