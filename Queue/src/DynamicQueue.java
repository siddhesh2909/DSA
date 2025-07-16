public class DynamicQueue  extends circularQueue{

    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean push(int val)
    {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            end = data.length;
            data = temp;

        }
        return super.push(val);
    }

}
