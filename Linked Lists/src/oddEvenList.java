public class oddEvenList {
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node newHead = Solution(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }

    }
    public static Node Solution(Node head)
    {
        if(head==null || head.next == null) return head;

        Node odd=head;
        Node even=head.next;
        Node evenHead = even;

        while(even!=null && even.next!=null)
        {
            odd.next= even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;

        return head;
    }
}
