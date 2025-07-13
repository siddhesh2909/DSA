package LinkedList;

public class main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(2);
//        list.display();
//      System.out.println(list.deleteAt(2));
//      list.display();
//        list.find(5);

//        DLL list = new DLL();
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.insert(6);
//        list.insertLast(7);
//        list.insertAt(5,99);
//
//        list.display();
//        list.displayRev();
        CLL list = new CLL();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.delete(5);
        list.display();

    }
}
