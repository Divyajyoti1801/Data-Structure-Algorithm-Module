package StringProgram;

import java.util.*;

public class DuplicateInString {
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        System.out.println("The Duplicate elements in the string: ");
        duplicateElementInString(str);
    }

    static void duplicateElementInString(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), 1);
            } else {
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> mapEl : count.entrySet()) {
            char key = (char) mapEl.getKey();
            int value = ((int) mapEl.getValue());
            if (value > 1) {
                System.out.println(key + ", count=" + value);
            }
        }
    }
}
