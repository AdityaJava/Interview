package DSA.sortingalgos.quicksort;

import DSA.sortingalgos.Swapper;

import java.util.Arrays;
import java.util.List;

public class QuickSortAbdulBari2 {

    private static void quickSort(List<Integer> list, int low, int high) {

        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(List<Integer> list, int low, int high) {
        int i = low;
        int j = high;
        int pivot = list.get(low);

        while (i < j) {
            do {
                i++;
            } while ((i < high) && list.get(i) <= pivot);

            do {
                j--;
            } while ((j > low) && list.get(j) > pivot);
            if (i < j) {
                Swapper.swap(list, i, j);
            }
        }
        Swapper.swap(list, low, j);
        return j;
    }

    public static void main(String[] args) {
        Integer infinity = 9999;
        List<Integer> list = Arrays.asList(1, 4, 2, 9, 3, 5, 100, 96, 110, 105, infinity);
        quickSort(list, 0, list.size() - 1);

        list.forEach(e -> System.out.println(e));
    }
}
