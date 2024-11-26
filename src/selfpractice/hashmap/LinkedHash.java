package selfpractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LinkedHash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "Krishna");
        map.put(2, "Ram");
        map.put(3, "Vitthal");
        map.put(4, "Rukmini");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Entry Key" + entry.getKey() + "Entry Value" + entry.getValue());
        }

        Map<Integer, String> map1 = new HashMap();
        map1.put(1, "Krishna");
        map1.put(2, "Ram");
        map1.put(3, "Vitthal");
        map1.put(4, "Rukmini");

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("Entry Key" + entry.getKey() + "Entry Value" + entry.getValue());
        }

    }
}
