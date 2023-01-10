package LinkedList;

public class ReverseLL {
    private int size;

    public int getSize() {
        return size;
    }

    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
            size++;
        }
    }

    Node head = null;

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
            // Condition of Empty List
        }
        // Condition of Non-Empty List
        Node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public void printList() {
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

    public void reverseLinkedListIterative() {
        if (head == null || head.link == null) {
            System.out.println("Reversing Not Possible");
            return;
        }
        Node prevNode = head;
        Node currNode = head.link;
        while (currNode != null) {
            Node nextNode = currNode.link;
            currNode.link = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.link = null;
        head = prevNode;
        printList();
    }

    public Node reverseLLRecursion(Node head) {
        if (head == null || head.link == null) {
            return head;
        }

        Node currNode = reverseLLRecursion(head.link);
        head.link.link = head;
        head.link = null;
        return currNode;
    }

    public static void main(String args[]) {
        ReverseLL rll = new ReverseLL();
        rll.addElement(1);
        rll.addElement(2);
        rll.addElement(3);
        rll.addElement(4);
        rll.addElement(5);
        rll.printList();
        rll.reverseLinkedListIterative();
        System.out.println("Linked List Reverse Recursive Approach: ");
        rll.head = rll.reverseLLRecursion(rll.head);
        rll.printList();
    }
}
