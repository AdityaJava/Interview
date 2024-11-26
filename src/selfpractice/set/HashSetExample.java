package selfpractice.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

// Internally, HashSet uses HashMap:
        System.out.println(set);  // Output: [A, B, C, D]

    }
}
