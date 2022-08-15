package Arrays;

import java.util.*;

public class ArrayFundamental {
    public static void main(String args[]){
        //Array have fixed size and contains homogenous elements (Element of same data type)
        //It has contiguous memory allocation
        /*
         * Advantages of Contiguous Memory Allocation
         * 1. Random Access
         * 2. Cache Friendliness
        */
        /*
         * Type of Arrays:
         * 1. Fixed Size Array
         * 2. Dynamic Size Array
        */
        /*
         * Advantage of Dynamic Size Array
         * 1. Dynamic Size
         * 2. Rich library function
         */
        int[] arr1=new int[]{1,2,3,4,5}; //fixed Size  Array: Java case: heap Allocated
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> arr2=new ArrayList<>(); //Dynamic Size Array: Heap Allocated Array
        arr2.add(2); //add the element at the end of ArrayList
        arr2.add(2);
        for(int i=0;i<arr2.size();i++){
            System.out.print(arr2.get(i)+" ");
        }
        System.out.println();
    }
}
