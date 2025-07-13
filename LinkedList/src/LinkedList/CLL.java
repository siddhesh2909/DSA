package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public CLL() {
        this.head = null;
        this.tail = null;
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        Node node =head;
        if(node != null) {
            do{
                System.out.print(node.val +"--> ");
                node = node.next;
            }while(node != head);
        }

    }

}
