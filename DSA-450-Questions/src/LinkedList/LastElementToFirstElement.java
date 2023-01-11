package LinkedList;

public class LastElementToFirstElement {
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

    static Node LastToFirst(Node head) {
        Node temp = head;
        Node temp1 = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = head.link;
        head.link = null;
        head = temp;
        temp = null;
        temp = head;
        while (temp.link != head) {
            temp = temp.link;
        }
        temp.link = null;
        temp.link = temp1;

        return head;
    }

    public static void main(String args[]) {
        addData(1);
        addData(2);
        addData(3);
        addData(4);
        addData(5);
        printLL(head);
        head = LastToFirst(head);
        printLL(head);



    }
}
