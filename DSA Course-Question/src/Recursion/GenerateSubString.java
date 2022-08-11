package Recursion;

public class GenerateSubString {
    public static void main(String args[]) {
        generateSubSets("ABC", "", 0);

    }

    public static void generateSubSets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        generateSubSets(str, curr, i + 1);
        generateSubSets(str, curr + str.charAt(i), i + 1);
    }

}
