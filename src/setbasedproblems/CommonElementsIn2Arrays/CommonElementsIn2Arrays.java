package setbasedproblems.CommonElementsIn2Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsIn2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println(findCommon(arr1, arr2)); // Output: [3, 4]
    }

    private static List<Integer> findCommon(int[] arr1, int[] arr2) {
        Set<Integer> unique = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr2).boxed().filter(element -> unique.contains(element)).collect(Collectors.toList());
    }
}
