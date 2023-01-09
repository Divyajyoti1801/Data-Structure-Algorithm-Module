package LinkedList;

import java.util.*;

public class PackageLinkedList {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(12);
        ll.add(13);
        ll.add(20);
        System.out.println(ll);
        ll.addLast(45);
        System.out.println(ll);
    }
}
