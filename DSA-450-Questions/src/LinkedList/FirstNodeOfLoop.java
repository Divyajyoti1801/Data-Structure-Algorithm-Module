package LinkedList;

public class FirstNodeOfLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node detectAndRemoveLoop(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        slow = slow.next;
        fast = fast.next.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != fast) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    public static void main(String args[]) {
        addData(50);
        addData(20);
        addData(15);
        addData(4);
        addData(10);
        printList(head);
        Node res = detectAndRemoveLoop(head);
        if (res == null) {
            System.out.println("Loop Does not exists");
        } else {
            System.out.println("Loop Starting node is: " + res.data);
        }
    }
}
