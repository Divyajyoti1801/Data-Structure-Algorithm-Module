package Arrays;

import java.util.*;

public class InsertElementAtPos {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(20);
        arr.add(1, 7);
        System.out.println("Updated Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
