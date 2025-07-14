package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

public class LinkedListCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                fast=head;
                while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static ListNode indexOfStart(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    public static int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                int len = 0;
                do {
                    slow = slow.next;
                    len++;
                } while (slow != fast);
                return len;
            }
        }

        return 0;
    }

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
        // Create linked list: 3 -> 2 -> 0 -> -4 -> points back to 2
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle
        fourth.next = second; // comment this line to remove the cycle

        LinkedListCycle sol = new LinkedListCycle();

        System.out.println("Cycle detected? " + sol.hasCycle(head));
        System.out.println("Length of the cycle: " + lengthOfCycle(head));

        ListNode start = indexOfStart(head);
        if (start != null) {
            System.out.println("Start of cycle is node with value: " + start.val);
        } else {
            System.out.println("No cycle, so no start node.");
        }
    }
}
