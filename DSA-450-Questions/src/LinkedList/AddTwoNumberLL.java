package LinkedList;

public class AddTwoNumberLL {
    static class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    static Node head = null;
    static Node secondHead = null;

    static void addNode(int data) {
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

    static void addNode2(int data) {
        Node newNode = new Node(data);
        if (secondHead == null) {
            secondHead = newNode;
            return;
        }
        Node temp = secondHead;
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

    static Node addNumbersLL(Node head, Node secondHead) {
        int number1 = 0;
        int number2 = 0;
        Node resulthead = null;
        Node tempNode = resulthead;
        while (head != null) {
            int digit = head.data;
            number1 = number1 * 10 + digit;
            head = head.link;
        }
        while (secondHead != null) {
            int digit = secondHead.data;
            number2 = number2 * 10 + digit;
            secondHead = secondHead.link;
        }
        int result = number1 + number2;
        int temp = result;
        while (temp != 0) {
            int digit = temp % 10;
            tempNode.link = new Node(digit);
            temp /= 10;

        }

        return resulthead;

    }

    public static void main(String args[]) {
        addNode(4);
        addNode(5);
        printLL(head);
        addNode2(3);
        addNode2(4);
        addNode2(5);
        printLL(secondHead);
    }
}
