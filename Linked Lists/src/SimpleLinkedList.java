////class Node {
////    int data;
////    Node next;
////
////    Node(int data, Node next) {
////        this.data = data;
////        this.next = next;
////    }
////}
//
//public class SimpleLinkedList {
//
//    static Node deleteTail(Node head )
//    {
//
//        if(head == null || head.next == null)
//        {
//            return null;
//        }
//
//        Node curr = head;
//
//        while(curr.next.next !=null)
//        {
//            curr=curr.next;
//        }
//        curr.next = null;
//
//        return head;
//    }
//
//    static Node insert(Node head, int data) {
//
//        Node newNode = new Node(data, null);
//
//        if (head == null) {
//            return newNode;
//        }
//
//        Node temp = head;
//
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//
//        return head;
//    }
//
//    static void printList(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " -> ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//
//        Node head = null;
//
//        head = insert(head, 10);
//        head = insert(head, 20);
//        head = insert(head, 30);
//        head = insert(head, 40);
//        printList(head);
//        head = deleteTail(head);
//
//        printList(head);
//    }
//}