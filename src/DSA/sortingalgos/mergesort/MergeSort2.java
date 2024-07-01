package DSA.sortingalgos.mergesort;

import java.util.List;

public class MergeSort2 {

    private void sort(List<Integer> list, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            sort(list, start, mid);
            sort(list, mid + 1, end);
            merge(list, start, mid, end);
        }

    }

    private void merge(List<Integer> list, int start, int mid, int end) {


    }

    public static void main(String[] args) {

    }
}
