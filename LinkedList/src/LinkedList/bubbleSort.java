package LinkedList;

public class bubbleSort {
    public static void main(String[] args) {
        LL list=new LL();
        for(int i=7; i>=1 ; i--)
        {
            list.insertLast(i);
        }
        list.display();
        list.BubbleSort();
        list.display();

    }
}
