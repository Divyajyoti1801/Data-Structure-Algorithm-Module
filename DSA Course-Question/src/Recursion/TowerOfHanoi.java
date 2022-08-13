package Recursion;

public class TowerOfHanoi {
    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Disk: " + n + " transfer from: " + source + " to: " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Disk: " + n + " transfer from: " + source + " to: " + destination);
        towerOfHanoi(n - 1, source, helper, destination);

    }
}
