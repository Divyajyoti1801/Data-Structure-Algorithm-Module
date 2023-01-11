package LinkedList;

import java.util.LinkedHashSet;

public class RemoveDuplicateInUnsortedList {
    static class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    static Node head = null;

    static void addData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    static void printLL(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }

    static Node removeDuplicate(Node head) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        Node temp = head;
        while (temp != null) {
            hs.add(temp.data);
            temp = temp.link;
        }
        Node x = new Node(-1);
        Node p = x;
        for (Integer y : hs) {
            x.link = new Node(y);
            x = x.link;
        }
        return p.link;

    }

    public static void main(String args[]) {
        addData(5);
        addData(2);
        addData(2);
        addData(4);
        printLL(head);
        head = removeDuplicate(head);
        printLL(head);
    }
}
