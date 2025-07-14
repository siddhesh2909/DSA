package LinkedList;

public class MergeSort {

    static class Node {
        int val;
        Node next;

        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
    }

    Node merge(Node f, Node s) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        while (f != null && s != null) {
            if (f.val < s.val) {
                tail.next = f;
                f = f.next;
            } else {
                tail.next = s;
                s = s.next;
            }
            tail = tail.next;
        }

        tail.next = (f != null) ? f : s;

        return dummyHead.next;
    }

    Node getMid(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = null;

        return slow;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        MergeSort sorter = new MergeSort();
        Node sorted = sorter.sortList(head);

        printList(sorted);
    }
}
