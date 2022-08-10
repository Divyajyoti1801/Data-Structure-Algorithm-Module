package Recursion;

public class PrintingReverse {
    public static void main(String args[]) {
        // Tail Recusrion: the function which have recursive call at last where parent
        // function doesn't have anything to do tail call must be executed immediatley
        // We cannot convert every non-tail recursive function to tail recursion
        reversePrint(5);
        System.out.println();
        straightPrint(5);
        System.out.println();
    }

    public static void reversePrint(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        reversePrint(n - 1);
    }

    public static void straightPrint(int n) {
        if (n == 0) {
            return;
        }
        straightPrint(n - 1);
        System.out.print(n + " ");
    }
}
