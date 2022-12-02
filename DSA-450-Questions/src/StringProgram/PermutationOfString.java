package StringProgram;

import java.util.*;

public class PermutationOfString {
    static List<String> subSeq = new ArrayList<>();

    public static void main(String args[]) {
        String S = "ABSG";
        printSubSequence(S, "");
        System.out.println("The Subsequence of Power-Set: " + subSeq);
        permutationOfString(S);
        System.out.println("All The Permutation of the String: " + permutationOfString(S));

    }

    static void printSubSequence(String S, String newStr) {
        if (S.length() == 0) {
            subSeq.add(newStr);
            return;
        }
        printSubSequence(S.substring(1), newStr + S.charAt(0));
        printSubSequence(S.substring(1), newStr);
    }

    static List<String> permutationOfString(String S) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        permutationFunction(S, "", ans, set);
        for (String s : set) {
            ans.add(s);
        }
        Collections.sort(ans);
        return ans;

    }

    static void permutationFunction(String S, String empty, List<String> ans, Set<String> set) {
        if (S.length() == 0) {
            set.add(empty);
            return;
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            String newString = S.substring(0, i) + S.substring(i + 1);
            permutationFunction(newString, empty + ch, ans, set);
        }
    }
}
