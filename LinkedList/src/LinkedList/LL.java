package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public int getVal() {
            return val;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertat(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(val, prev.next);
        prev.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAt(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                System.out.println(node.val);;
            }
            node = node.next;
        }
        System.out.println();;
    }


    private Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    public void inserRec(int index, int val) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public void RemoveDuplicates() {
        Node node = head;
        while (node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            }
            else  {
                node = node.next;
            }
        }
        tail=node;
        tail.next = null;
    }

    public LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            }
            else {
                ans.insertLast(s.val);
                s = s.next;
            }

        }
        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return  ans;
    }

    public void middleNode() {

        Node fast=head;
        Node slow =head;

        while(fast != null && fast.next != null)
        {
            fast=fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
    }

    public void BubbleSort()
    {
        bubble(size-1,0);
    }

    public void bubble(int r , int c)
    {
        if( r == 0)
        {
            return;
        }
        if(c<r)
        {
            Node first = get(c);
            Node second = get(c+1);

            if(first.val > second.val)
            {
                if(first == head)
                {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev= get(c-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else {
                    Node prev= get(c-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }

            }
            bubble(r,c+1);


        }
        bubble(r-1,0);
    }

    public void revRec(Node node)
    {
        if(node == tail)
        {
            head = tail;
            return;
        }
        revRec(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void revrse(Node node)
    {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        head = prev;
    }


    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertLast(4);
        ll.insertLast(5);
        ll.insertLast(6);
        ll.insertLast(7);
        Node head = ll.head;
        ll.display();
//        ll.revRec(head);
        ll.revrse(head);
        ll.display();
    }


}
