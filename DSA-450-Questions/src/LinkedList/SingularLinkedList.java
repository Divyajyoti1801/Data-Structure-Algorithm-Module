package LinkedList;

public class SingularLinkedList {
    class Node {
        String data;
        Node link;

        Node(String data) {
            this.data = data;
            this.link = null;
            size++;
        }
    }

    Node head = null;
    private int size;

    SingularLinkedList() {
        this.size = 0;
    }

    // Node Insertion at Last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
    }

    public void addLast(String data) {
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

    public void printList() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.link;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.link;
        size--;
        printList();
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.link == null) {
            head = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.link != null) {
            prev = temp;
            temp = temp.link;
        }
        prev.link = null;
        printList();

    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        SingularLinkedList sll = new SingularLinkedList();
        sll.addFirst("Divya");
        sll.addLast("Jyoti");
        sll.addLast("23");
        sll.addLast("Billionaire");
        System.out.println(sll.getSize());
        sll.printList();
        sll.deleteFirst();
        sll.deleteLast();
        System.out.println(sll.getSize());
    }


}
