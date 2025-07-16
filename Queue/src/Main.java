public class Main {
    public static void main(String[] args) {
        customQueue queue = new customQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);

        queue.display();
        queue.remove();
        queue.display();

        }

}