package ArraySection;

public class PalindromicArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 111, 222, 333, 444, 555 };
        System.out.println("Is it a palindromic array: " + PalinArray(arr));
    }

    static int PalinArray(int arr[]) {
        int count = 0;

        for (int num : arr) {
            if (CheckPalindrome(num)) {
                count++;
            }
        }
        if (count == arr.length) {
            return 1;
        }

        return 0;
    }

    static boolean CheckPalindrome(int num) {
        int rev = 0;
        int check = num;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (rev == check) {
            return true;
        }

        return false;
    }
}
