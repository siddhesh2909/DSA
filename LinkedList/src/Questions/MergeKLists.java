package Questions;
import java.util.ArrayList;
import java.util.List;
public class MergeKLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        while (lists.length > 1) {
            List<ListNode> temp = new ArrayList<>();
            for (int i = 0; i < lists.length; i += 2) {
                ListNode l1 = lists[i];
                ListNode l2 = i + 1 < lists.length ? lists[i + 1] : null;
                temp.add(mergeLists(l1, l2));
            }
            lists = temp.toArray(new ListNode[0]);
        }

        return lists[0];
    }

    private static ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode ans = node;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                l2 = l2.next;
            } else {
                node.next = l1;
                l1 = l1.next;
            }
            node = node.next;
        }

        node.next = l1 != null ? l1 : l2;
        return ans.next;
    }

    public static void main(String[] args) {
        // Input: k = 3 sorted linked lists
        ListNode[] lists = new ListNode[3];
        
        // First list: 1 -> 4 -> 5
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        
        // Second list: 1 -> 3 -> 4
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        
        // Third list: 2 -> 6
        lists[2] = new ListNode(2, new ListNode(6));

        ListNode result = mergeKLists(lists);
        
        // Output the merged list
        printList(result);  // Expected Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }
}
