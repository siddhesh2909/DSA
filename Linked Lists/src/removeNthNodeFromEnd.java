public class removeNthNodeFromEnd {
    public static void main(String [] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node newHead = Solution(head , 4);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
    public static Node Solution(Node head, int n){
        Node dummy= new Node(0);
        dummy.next=head;

        Node slow = dummy;
        Node fast=dummy;
        for(int i=0; i<= n ; i++)
        {
            fast=fast.next;
        }
        while (fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
