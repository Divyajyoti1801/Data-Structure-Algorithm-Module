package ArraySection;

import java.util.*;

public class LongestCommonSubsequence {
    static List<String> al = new ArrayList<>();

    public static void main(String args[]) {
        String s1 = "ABCAB";
        String s2 = "PBCC";
        printingSubSequence(s1, "");
        System.out.println(al);
        al.clear();
        printingSubSequence(s2, "");
        System.out.println(al);
    }

    // Dynamic Programming
    /*
     * Dynamic Programming is a technique that breaks the problems into
     * sub-problems, and save the result for future purposes so that
     * we do not need to compute result again. The Subproblem are optimized to
     * optimize the overall solution is known as optimal substructure property.
     */
    /*
     * Empty String can never be a sub sequence. The order of character must be
     * followed compared to original string
     */

    static void printingSubSequence(String str, String newStr) {
        if (str.length() == 0) {
            al.add(newStr);
            return;
        }

        printingSubSequence(str.substring(1), newStr + str.charAt(0));
        printingSubSequence(str.substring(1), newStr);
    }

}
