package StringProgram;

import java.util.*;

public class LongestRepeatingSubSequence {
    static List<String> al = new ArrayList<>();

    public static void main(String args[]) {
        String str = "axxxy";
        printAllSubSequence(str, "");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }

    // Understanding Sub-Sequence
    static void printAllSubSequence(String str, String ans) {
        if (str.length() == 0) {
            al.add(ans);
            return;
        }

        printAllSubSequence(str.substring(1), ans + str.charAt(0));
        printAllSubSequence(str.substring(1), ans);
    }

    // Longest repeating Sub-Sequence
    static int longestRepeatingSubSequence(String str) {
        return 0;
    }
}
