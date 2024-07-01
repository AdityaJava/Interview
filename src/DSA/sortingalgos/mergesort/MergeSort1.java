package DSA.sortingalgos.mergesort;

import java.util.Arrays;

public class MergeSort1 {

    void sort(int arr[], int l, int r) {
        int m = 0;
        if (l < r) {

            m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int leftArr[] = new int[n1];

        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[i + l];

        for (int i = 0; i < n2; i++)
            rightArr[i] = arr[m + 1 + i];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 6, 8, 5};
        MergeSort1 mergeSort1 = new MergeSort1();
        mergeSort1.sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }
}
