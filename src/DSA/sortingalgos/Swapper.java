package DSA.sortingalgos;

import java.util.List;

public class Swapper {

    public static void swap(List<Integer> list, int pos1, int pos2) {
        Integer temp = list.get(pos2);
        list.set(pos2, list.get(pos1));
        list.set(pos1, temp);
    }

}
