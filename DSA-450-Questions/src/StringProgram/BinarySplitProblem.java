package StringProgram;

public class BinarySplitProblem {
    public static void main(String args[]) {
        String str = "0100110101";
        System.out.println("Number of SubString which contains equal number O's and 1's: " + binarySplit(str));
    }

    static int binarySplit(String str) {
        int count0 = 0, count1 = 0;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            if (count0 == count1) {
                cnt++;
            }
        }
        if (count0 != count1) {
            return -1;
        }
        return cnt;
    }
}
