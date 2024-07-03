package DSA.sortingalgos.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort2 {

    private static void sort(List<Integer> list, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            sort(list, start, mid);
            sort(list, mid + 1, end);
            merge(list, start, mid, end);
        }

    }

    private static void merge(List<Integer> list, int start, int mid, int end) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = start; i <= mid; i++) {
            list1.add(list.get(i));
        }

        for (int i = mid + 1; i <= end; i++) {
            list2.add(list.get(i));
        }
        int list1Size = list1.size();
        int list2Size = list2.size();
        int list1Pointer = 0, list2Pointer = 0;
        int listPointer = start;
        while (list1Pointer < list1Size && list2Pointer < list2Size) {
            if (list1.get(list1Pointer) <= list2.get(list2Pointer)) {
                list.set(listPointer, list1.get(list1Pointer));
                list1Pointer++;
            } else {
                list.set(listPointer, list2.get(list2Pointer));
                list2Pointer++;
            }
            listPointer++;
        }

        for (int i = list1Pointer; i < list1Size; i++) {
            list.set(listPointer, list1.get(i));
            listPointer++;
        }

        for (int i = list2Pointer; i < list2Size; i++) {
            list.set(listPointer, list2.get(i));
            listPointer++;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 2, 9, 4, 0, 34, 12);
        MergeSort2.sort(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
