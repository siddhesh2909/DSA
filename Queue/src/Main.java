public class Main {
    public static void main(String[] args) {
//        customQueue queue = new customQueue();
//        queue.push(10);
//        queue.push(20);
//        queue.push(30);
//        queue.push(40);
//        queue.push(50);
//
//        queue.display();
//        queue.remove();
//        queue.display();

        circularQueue circularQueue = new DynamicQueue(5);
        circularQueue.push(10);
        circularQueue.push(20);
        circularQueue.push(30);
        circularQueue.push(40);
        circularQueue.push(50);
        circularQueue.push(50);
        circularQueue.push(60);
        circularQueue.remove();
//      circularQueue.push(60);

        circularQueue.display();



        }

}