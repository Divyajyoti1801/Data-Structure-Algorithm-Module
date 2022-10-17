package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashDataStructureTwo {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "India");
        map.put(2, "USA");
        map.put(3, "Russia");
        map.put(4, "Japan");
        map.put(5, "China");

        // Print Map
        System.out.println(map);
        // Search Operation
        if (map.containsKey(2)) {
            System.out.println(map.get(2));
            System.out.println("Contains");
        } else {
            System.out.println("Not Contains");
        }

        // Iteration Operation on HASHMAP
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print(e.getKey() + " : " + e.getValue() + ", ");
        }
        System.out.println();
        // Iterate through keys
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.print(k + " ");
        }
        System.out.println();

    }
}
