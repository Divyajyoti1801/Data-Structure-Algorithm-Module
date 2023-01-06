package LinkedList;

public class SingularLinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Add of nodes in Linked List: First
    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add of nodes in Linked List: Last
    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Traverse of Linked List
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public static void main(String args[]) {
        SingularLinkedList sll = new SingularLinkedList();
        sll.addFirst("a");
        sll.addFirst("is");

    }

}
