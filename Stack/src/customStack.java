public class customStack {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public int push(int value) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full");
        }
        data[++ptr] = value;

        return value;
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    public int pop() throws StackException {
        if(isEmpty())
        {
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty())
        {
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }
    private boolean isEmpty() {
        return ptr == -1;
    }




}
