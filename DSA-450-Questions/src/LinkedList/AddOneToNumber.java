package LinkedList;

public class AddOneToNumber {
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

    static Node addOne(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        int num = 0;
        while (temp != null) {
            int digit = temp.data;
            num = num * 10 + digit;
            temp = temp.link;
        }
        Node newNode = new Node(num + 1);
        head = newNode;
        return head;

    }

    public static void main(String args[]) {
        addData(4);
        addData(5);
        addData(6);
        printLL(head);
        head = addOne(head);
        System.out.println(head.data);
    }
}
