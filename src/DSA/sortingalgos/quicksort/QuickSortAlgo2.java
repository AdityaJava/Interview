package DSA.sortingalgos.quicksort;

import java.util.Arrays;
import java.util.List;

public class QuickSortAlgo2 {

    private static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }

    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list, j, i);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Integer> list, int pos1, int pos2) {
        Integer temp = list.get(pos2);
        list.set(pos2, list.get(pos1));
        list.set(pos1, temp);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 2, 9, 3, 5, 100, 96);

        quickSort(list, 0, list.size() - 1);

        list.forEach(e -> System.out.println(e));

    }


}
