package DSA.sortingalgos.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort3 {

    private void sort(List<Integer> list, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(list, start, mid);
            sort(list, mid + 1, end);
            merge(list, start, mid, end);
        }
    }

    private void merge(List<Integer> list, int start, int mid, int end) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = start; i < mid + 1; i++) {
            list1.add(list.get(i));
        }

        for (int i = mid + 1; i < end + 1; i++) {
            list2.add(list.get(i));
        }

        //
        int list1Pointer = 0;
        int list2Pointer = 0;

        int list1Size = list1.size();
        int list2Size = list2.size();

        int listPointer = start;

        while (list1Pointer < list1Size && list2Pointer < list2Size) {
            if (list1.get(list1Pointer) <= list2.get(list2Pointer)) {
                list.set(listPointer, list1.get(list1Pointer));
                list1Pointer++;
            } else if (list1.get(list1Pointer) > list2.get(list2Pointer)) {
                list.set(listPointer, list2.get(list2Pointer));
                list2Pointer++;
            }
            listPointer++;
        }

        while (list1Pointer < list1Size) {
            list.set(listPointer, list1.get(list1Pointer));
            listPointer++;
            list1Pointer++;
        }
        while (list2Pointer < list2Size) {
            list.set(listPointer, list2.get(list2Pointer));
            listPointer++;
            list2Pointer++;
        }
        //
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 6, 8, 5);
        MergeSort3 mergeSort3 = new MergeSort3();
        mergeSort3.sort(list, 0, list.size() - 1);
        list.forEach(value -> System.out.println(value));
    }


}
