package StringProgram;

import java.util.*;

public class PermutationOfString {
    static List<String> subSeq = new ArrayList<>();

    public static void main(String args[]) {
        String S = "ABSG";
        printSubSequence(S, "");
        System.out.println("The Subsequence of Power-Set: " + subSeq);

    }

    static void printSubSequence(String S, String newStr) {
        if (S.length() == 0) {
            subSeq.add(newStr);
            return;
        }
        printSubSequence(S.substring(1), newStr + S.charAt(0));
        printSubSequence(S.substring(1), newStr);
    }

    // static List<String> permutationOfString(String S) {

    // }

}
