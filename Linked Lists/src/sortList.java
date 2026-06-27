public class sortList {
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node newHead = sort(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }

    }
    public static Node sort(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node secondHalf = getMid(head);

        Node left = sort(head);
        Node right = sort(secondHalf);

        return merge(left, right);

    }

    public static Node merge(Node left, Node right)
    {
        Node dummy = new Node(-1);
        Node tail= dummy;
        while(left!=null && right!=null)
        {
            if(left.data <= right.data)
            {
                tail.next=left;
                left=left.next;
            }else{
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }

        tail.next = left!=null ? left : right;


        return dummy.next;
    }

    public static Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=null;

        while(fast!=null && fast.next!= null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;

        return slow;
    }

}
