public class Maze {
    public static void main(String[] args) {
        System.out.println(mazeCount(3,3));
        mazePath("",3,3);
    }
    public static int mazeCount(int r, int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }

        int left = mazeCount(r-1,c);
        int right = mazeCount(r,c-1);

        return left+right;
    }

    public static void mazePath(String p,int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            mazePath(p+'D',r-1,c);
        }
        if(c>1)
        {
            mazePath(p+'R',r,c-1);
        }

    }
}
