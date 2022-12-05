package StringProgram;

public class EditDistanceChallenge {
    public static void main(String args[]) {
        String s = "geek";
        String t = "geeks";

    }

    static int editDistance(String s, String t) {
        if (s.equals(t)) {
            return 0;
        }
        int ops_count = 0;
        // 1. Operation: Insert a character in any position
        // 2. Operation: Remove any character from String
        // 3. Operation: Replace any character form the String with any other character

        return ops_count;
    }
}
