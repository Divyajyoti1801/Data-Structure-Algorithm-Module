package ArraySection;

import java.util.*;

public class FactorialOfLargeNumbers {
    public static void main(String args[]) {
        int n = 897;
        ArrayList<Integer> result = factorialList(n);
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    static ArrayList<Integer> factorialList(int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        int fact = 1;
        int carry = 0;
        if (N == 1) {
            arr.add(1);
            return arr;
        }
        arr.add(2);
        for (int i = 3; i <= N; i++) {
            for (int j = 0; j < arr.size(); j++) {
                fact = arr.get(j) * i;
                if (carry != 0) {
                    fact += carry;
                }
                carry = fact / 10;
                arr.set(j, fact % 10);
            }
            if (carry != 0) {
                while (carry != 0) {
                    arr.add(carry % 10);
                    carry /= 10;
                }
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}
