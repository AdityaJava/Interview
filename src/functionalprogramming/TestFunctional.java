package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctional {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 4, 6, 7, 8);

        Consumer<Integer> printVals = (Integer val) -> {
            System.out.println(val);
        };
        integerList.forEach(printVals);

        /////////
        System.out.println("With Lambda Expressions");
        integerList.forEach((Integer val) -> {
            System.out.println(val);
        });
    }

}
