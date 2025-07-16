package Questions;

public class RemoveNodeFromEnd {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution111 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            System.out.println("Head is " + head.val);
            ListNode temp = head;
            int size = 1;
            while (temp.next != null) {
                temp = temp.next;
                size++;
            }

            System.out.println("size is " + size);
            if (n == size) {
                return head.next;
            }

            int target = size - n;
            System.out.println("target is " + target);
            temp = head;
            for (int i = 1; i < target; i++) {
                temp = temp.next;
            }
            System.out.println("temp is " + temp.val);
            temp.next = temp.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        Solution111 sol = new Solution111();
        ListNode newHead = sol.removeNthFromEnd(head, n);

        printList(newHead);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
