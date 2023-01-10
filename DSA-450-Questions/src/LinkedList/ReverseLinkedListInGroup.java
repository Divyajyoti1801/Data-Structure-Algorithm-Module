package LinkedList;

public class ReverseLinkedListInGroup {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head = null;
    private int size;

    ReverseLinkedListInGroup() {
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
            temp = temp.next;
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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int getSize() {
        return size;
    }

    public Node reverse(Node node, int k) {
        Node prev = null;
        Node next;
        Node curr = node;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (node != null) {
            node.next = reverse(curr, k);
        }
        return prev;
    }

    public static void main(String args[]) {
        ReverseLinkedListInGroup gll = new ReverseLinkedListInGroup();
        gll.addElement(1);
        gll.addElement(2);
        gll.addElement(2);
        gll.addElement(4);
        gll.addElement(5);
        gll.addElement(6);
        gll.addElement(7);
        gll.addElement(8);
        gll.printList();
        gll.head = gll.reverse(gll.head, 4);
        gll.printList();
    }
}
