package LinkedList;

public class MergeTwoSortedLinkLists {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();


        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);

        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(7);
        second.insertLast(8);

        LL ans = first.merge(first,second);

        first.display();
        second.display();
        ans.display();
    }
}
