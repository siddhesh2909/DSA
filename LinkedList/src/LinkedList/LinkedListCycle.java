package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create a cycle here: -4 -> 2
        fourth.next = second; // comment this line to test "no cycle" case

        LinkedListCycle sol = new LinkedListCycle();
        boolean result = sol.hasCycle(head);

        System.out.println("Cycle detected? " + result);
    }
}
