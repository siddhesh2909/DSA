package LinkedList;

public class DLL {

    private Node head;

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            head.prev = null;
            head = node;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insertAt(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Node not found");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        newNode.prev = p;

        if (p.next != null) {
            p.next.prev = newNode;
        }
        p.next = newNode;
    }

    public Node find(int val) {
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        while(node != null){
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayRev() {
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }
        while(last != null){
            System.out.print(last.val + "-->");
            last = last.prev;
        }
        System.out.println("End");
    }
}
