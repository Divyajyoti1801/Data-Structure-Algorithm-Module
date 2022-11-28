package StringProgram;

public class CheckStringIsRotation {
    public static void main(String args[]) {
        String str1 = "AACD";
        String str2 = "ACDA";
        if (checkStringHasRotation(str1, str2)) {
            System.out.println("Rotation of Each other");
        } else {
            System.out.println("Not a rotation of each other");
        }

    }

    static boolean checkStringHasRotation(String str1, String str2) {
        return (str1.length() == str2.length() && ((str1 + str1).indexOf(str2) != -1));
    }
}
