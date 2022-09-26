package SortingTechnique;

import java.util.*;

class MyCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o1 % 2 - o2 % 2;
    }

}

public class SortingInJava {
    public static void main(String args[]) {
        Integer arr[] = new Integer[] { 5, 20, 10, 3, 12 };
        Arrays.sort(arr, new MyCmp());
        System.out.println(Arrays.toString(arr));
    }
}
