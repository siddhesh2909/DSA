package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(2);
        list.display();
//        System.out.println(list.deleteAt(2));
//        list.display();
        list.find(5);

    }
}
