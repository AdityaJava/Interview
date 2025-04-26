package DSA.sortingalgos.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortPractice {

    private static void sort(List<Integer> integerList, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(integerList, start, mid);
            sort(integerList, mid + 1, end);
            merge(integerList, start, mid, end);
        }
    }

    private static void merge(List<Integer> integerList, int start, int mid, int end) {
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        for (int i = start; i <= mid; i++) {
            integerList1.add(integerList.get(i));
        }

        for (int i = mid + 1; i <= end; i++) {
            integerList2.add(integerList.get(i));
        }

        int listPointer = start;
        int list1Pointer = 0;
        int list2Pointer = 0;
        while (list1Pointer < integerList1.size() && list2Pointer < integerList2.size()) {
            if (integerList1.get(list1Pointer) <= integerList2.get(list2Pointer)) {
                integerList.set(listPointer, integerList1.get(list1Pointer));
                list1Pointer++;
            } else {
                integerList.set(listPointer, integerList2.get(list2Pointer));
                list2Pointer++;
            }
            listPointer++;
        }

        for (int i = list1Pointer; i < integerList1.size(); i++) {
            integerList.set(listPointer, integerList1.get(i));
            listPointer++;
        }
        for (int i = list2Pointer; i < integerList2.size(); i++) {
            integerList.set(listPointer, integerList2.get(i));
            listPointer++;
        }


    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 2, 9, 4, 0, 34, 12);
        MergeSortPractice.sort(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
