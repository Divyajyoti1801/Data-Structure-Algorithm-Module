package Mathematics;

import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String args[]) {
        SOF(9);
    }

    public static void SOF(int num) {
        System.out.println("Implementatio of Sieve of Eratosthenes: ");
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
