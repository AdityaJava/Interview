package DSA.sortingalgos.mergesort;

import java.util.Arrays;

public class MergeSortGFG {

    void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int median = start + (end - start) / 2;
            mergeSort(arr, start, median);
            mergeSort(arr, median + 1, end);

            merge(arr, start, median, end);
        }
    }

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[i + l];
        }

        k = 0;
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[m + 1 + i];
        }

        k = l;

        int pos1 = 0, pos2 = 0;

        int pos = l;
        while (pos1 < n1 && pos2 < n2) {

            if (arr1[pos1] >= arr2[pos2]) {
                arr[pos] = arr2[pos2];
                pos2++;
                pos++;
            } else {
                arr[pos] = arr1[pos1];
                pos1++;
                pos++;
            }

        }

        for (int i = pos1; i < n1; i++) {
            arr[pos] = arr1[pos1];
            pos++;
        }

        for (int i = pos2; i < n2; i++) {
            arr[pos] = arr2[pos2];
            pos++;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 90, 23, 51, 12, 2};
        MergeSortGFG mergeSortGFG = new MergeSortGFG();
        mergeSortGFG.mergeSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }

}



