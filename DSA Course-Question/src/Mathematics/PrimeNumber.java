package Mathematics;

public class PrimeNumber {
    public static void main(String args[]) {
        int n = 10;
        int flag = 1;
        if (n % 2 != 0) {
            flag = 0;
        }
        if (n % 3 != 0) {
            flag = 0;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
