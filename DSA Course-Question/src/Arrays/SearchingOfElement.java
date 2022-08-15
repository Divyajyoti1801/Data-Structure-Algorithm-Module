package Arrays;

import java.util.*;

public class SearchingOfElement {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(5);
        arr.add(7);
        arr.add(25);
        if(arr.contains(5)){
            System.out.println("Search Successful");
        }else{
            System.out.println("Search Unsuccessful");
        }
    }
}
