package DSA.sortingalgos.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMerge {

    public static void main(String[] args) {
        List<Integer> sortedList1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> sortedList2 = Arrays.asList(2, 4, 6, 8, 11);
        MyMerge.merge(sortedList1, sortedList2).forEach(e -> {
            System.out.println(e);
        });
    }

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {

        List<Integer> sortedList = new ArrayList<>();

        Integer list1Size = list1.size();
        Integer list2Size = list2.size();

        Integer list1Pointer = 0;
        Integer list2Pointer = 0;

        while (list1Pointer < list1Size && list2Pointer < list2Size) {
            if (list1.get(list1Pointer) <= list2.get(list2Pointer)) {
                sortedList.add(list1.get(list1Pointer));
                list1Pointer++;
            } else {
                sortedList.add(list2.get(list2Pointer));
                list2Pointer++;
            }
        }
        for (int k = list1Pointer; k < list1Size; k++) {
            sortedList.add(list1.get(k));
        }
        for (int k = list2Pointer; k < list2Size; k++) {
            sortedList.add(list2.get(k));
        }
        return sortedList;
    }

}
