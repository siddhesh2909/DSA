package Questions;

public class LinkedListIntersectionInput {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;

        ListNode result = getIntersectionNode(headA, headB);

        System.out.print("List A: ");
        printList(headA);
        System.out.print("List B: ");
        printList(headB);
        System.out.println(result.val);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}
