package DSA.sortingalgos.mergesortedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMerge2 {
    public static void main(String[] args) {
        List<Integer> sortedList1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> sortedList2 = Arrays.asList(2, 4, 6, 8, 11);
        MyMerge2.merge(sortedList1, sortedList2).forEach(e -> {
            System.out.println(e);
        });
    }

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {

        int list1Pointer = 0;
        int list2Pointer = 0;

        List<Integer> sortedList = new ArrayList<>();
        int list1Size = list1.size();
        int list2Size = list2.size();

        while (list1Pointer < list1Size && list2Pointer < list2Size) {
            if (list1.get(list1Pointer) < list2.get(list2Pointer)) {
                sortedList.add(list1.get(list1Pointer));
                list1Pointer++;
            } else if (list1.get(list1Pointer) > list2.get(list2Pointer)) {
                sortedList.add(list2.get(list2Pointer));
                list2Pointer++;
            }
        }

        while (list1Pointer < list1Size) {
            sortedList.add(list1.get(list1Pointer));
            list1Pointer++;
        }
        while (list2Pointer < list2Size) {
            sortedList.add(list2.get(list2Pointer));
            list2Pointer++;
        }
        return sortedList;
    }
}
