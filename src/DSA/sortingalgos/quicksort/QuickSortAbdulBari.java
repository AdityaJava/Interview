package DSA.sortingalgos.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortAbdulBari {

    private static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(low);
        int i = low, j = high;
        while (i < j) {
            do {
                i++;
            } while (i < high && (list.get(i) <= pivot));

            do {
                j--;
            } while (j > low && (list.get(j) > pivot));

            if (i < j) {
                swap(list, i, j);
            }
        }
        swap(list, low, j);
        return j;
    }

    private static void swap(List<Integer> list, int pos1, int pos2) {
        Integer temp = list.get(pos2);
        list.set(pos2, list.get(pos1));
        list.set(pos1, temp);
    }

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2, 1, 10);
        Integer infinity = 9999;
        List<Integer> list = Arrays.asList(1, 4, 2, 9, 3, 5, 100, 96, 110, 105, infinity);
        quickSort(list, 0, list.size() - 1);

        list.forEach(e -> System.out.println(e));

    }
}
