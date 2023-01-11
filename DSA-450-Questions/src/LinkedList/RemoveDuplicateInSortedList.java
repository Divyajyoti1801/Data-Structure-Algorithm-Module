package LinkedList;

public class RemoveDuplicateInSortedList {
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
        Node temp = head;
        if (head == null) {
            return null;
        }
        while (temp.link != null) {
            if (temp.data == temp.link.data) {
                Node delNode = temp.link;
                temp.link = delNode.link;
                delNode.link = null;
            } else {
                temp = temp.link;
            }
        }
        return head;
    }

    public static void main(String args[]) {
        addData(2);
        addData(2);
        addData(3);
        addData(4);
        addData(10);
        addData(13);
        addData(18);
        addData(18);
        addData(20);
        addData(20);
        addData(27);
        addData(28);
        addData(30);
        addData(32);
        addData(33);
        addData(35);
        addData(40);
        addData(41);
        addData(42);
        addData(45);
        addData(53);
        addData(54);
        addData(57);
        addData(61);
        addData(66);
        addData(68);
        addData(69);
        addData(71);
        addData(72);
        addData(76);
        addData(77);
        addData(79);
        addData(81);
        addData(82);
        addData(84);
        addData(87);
        addData(87);
        addData(87);
        addData(90);
        addData(93);
        addData(95);
        addData(96);
        addData(98);

        printLL(head);
        removeDuplicate(head);
        printLL(head);
    }
}
