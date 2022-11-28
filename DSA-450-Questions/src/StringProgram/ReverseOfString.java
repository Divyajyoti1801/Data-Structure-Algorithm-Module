package StringProgram;

public class ReverseOfString {
    public static void main(String args[]) {
        String str = "Divyajyoti";
        System.out.println("Reverse of the String: " + reverseOfString(str, str.length() - 1, ""));

    }

    static String reverseOfString(String str, int i, String newString) {
        if (i < 0) {
            return newString;
        }
        return reverseOfString(str, i - 1, newString + str.charAt(i));
    }
}
