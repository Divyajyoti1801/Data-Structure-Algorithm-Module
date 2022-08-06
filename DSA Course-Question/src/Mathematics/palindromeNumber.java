package Mathematics;

public class palindromeNumber {
    public static void main(String args[]) {
        int num = 1221;
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
