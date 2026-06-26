class Node {
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class DoublyList {

    // Insert at beginning
    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data, null, head);

        if (head != null) {
            head.prev = newNode;
        }

        return newNode;
    }

    // Insert at end
    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data, null, null);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Display Forward
    public static void displayForward(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display Backward
    public static void displayBackward(Node head) {
        if (head == null) return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10, null, null);

        head = insertAtHead(head, 5);
        head = insertAtHead(head, 2);

        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);

        System.out.println("Forward Traversal:");
        displayForward(head);

        System.out.println("Backward Traversal:");
        displayBackward(head);
    }
}