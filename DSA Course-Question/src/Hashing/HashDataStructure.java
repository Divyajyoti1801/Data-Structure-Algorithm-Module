package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashDataStructure {
    public static void main(String args[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(10);
        hashSet.add(50);
        hashSet.add(100);

        // Printing Set
        for (int h : hashSet) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Searching in HASHSET
        if (hashSet.contains(20)) {
            System.out.println("Contains");
        } else {
            System.out.println("Not Contains");
        }

        // Delete in HASHSET
        hashSet.remove(10);
        if (!hashSet.contains(10)) {
            System.out.println("Element: 10 has been removed");
        }

        // Print ALL element of HASHSET
        System.out.println(hashSet);

        // Size of HASHSET
        System.out.println("Size of Hashset: " + hashSet.size());

        // Using Iterator on HASHSET
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
