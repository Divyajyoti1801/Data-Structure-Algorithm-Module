package LinkedList;

public class ReverseLinkedList {
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
    private int size;

    ReverseLinkedList() {
        this.size = 0;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.link;
        }
        System.out.println("Null");
    }

    public void addElement(int data) {
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

    public int getSize() {
        return size;
    }

    public void reverseLinkedList() {
        if (head == null || head.link == null) {
            System.out.println("List is Empty");
            return;
        }
        Node prevNode = head;
        Node currNode = head.link;
        while (currNode != null) {
            Node nextNode = currNode.link;
            currNode.link = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.link = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.link == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.link);
        head.link.link = head;
        head.link = null;
        return newHead;
    }

    public void fromLastToElementDelete(int n) {
        int originalPlace = getSize() - n + 1;
        int i = 1;
        Node currNode = head;
        while (i < originalPlace) {
            currNode = currNode.link;
            i++;
        }
        System.out.println(currNode.data);

    }

    public static void main(String args[]) {
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.addElement(1);
        rll.addElement(2);
        rll.addElement(3);
        rll.addElement(4);
        rll.addElement(5);
        rll.printList();
        rll.reverseLinkedList();
        rll.printList();
        rll.head = rll.reverseRecursive(rll.head);
        rll.printList();
        rll.fromLastToElementDelete(2);
    }
}
