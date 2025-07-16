public class circularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int front=0;
    protected int end = 0;
    protected int size = 0;

    public circularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length ;
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Full");
            return false;
        }

        data[end++] = value;
        end %= data.length;
        size++;
        return true;
    }

    public int remove()
    {
        if (isEmpty()) {
            return -1;
        }
        int removed= data[front++];
        front %= data.length;
        size --;

        return removed;
    }
    public int front()
    {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do {
            System.out.print(data[i] + "<--");
            i = (i + 1) % data.length;
        } while (i != end);

        System.out.println("END");
    }


}
