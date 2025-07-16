public class customQueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public customQueue()
    {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length ;
    }

    public boolean push(int value) {
        if (isFull()) {
            return false;
        }

        data[end++] = value;
        return true;
    }

    public int remove()
    {
        if (isEmpty()) {
            return -1;
        }
        int removed= data[0];
        for(int i =1; i < end ; i++)
        {
            data[i-1] = data[i];
        }
        end --;

        return removed;
    }
    public int front()
    {
        if (isEmpty()) {
            return -1;
        }
        return data[0];
    }

    public void display()
    {
        for (int i = 0 ; i < end ; i++)
        {
            System.out.print(data[i] + "<--");
        }
        System.out.println("END");
    }

}
