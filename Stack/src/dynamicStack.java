public class dynamicStack extends customStack{
    public dynamicStack() {
        super();
    }
    public dynamicStack(int size){
        super(size);
    }

    @Override
    public int push(int value) throws StackException {
        if(isFull())
        {
            int[] temp = new int[data.length * 2];
            for(int i = 0; i < data.length; i++)
                temp[i] = data[i];

            data = temp;
        }

        return super.push(value);
    }
}
