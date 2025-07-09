import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3,3));
//        mazePath("",3,3);
//        System.out.println(mazePathList("",3,3));
//        System.out.println(mazePathListDigonal("",3,3));
        boolean[][] board=
                {
                        {true,true,true},
                        {true,false,true},
                        {true,true,true},
                };
        mazeRestriction("",board,0,0);
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
    public static ArrayList<String> mazePathList(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
        {
            list.addAll(mazePathList(p+'D',r-1,c));
        }
        if(c>1)
        {
            list.addAll(mazePathList(p+'R',r,c-1));
        }
        return list;
    }

    public static ArrayList<String> mazePathListDigonal(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
        {
            list.addAll(mazePathListDigonal(p+'V',r-1,c));
        }
        if(c>1)
        {
            list.addAll(mazePathListDigonal(p+'H',r,c-1));
        }
        if(r>1 && c>1)
        {
            list.addAll(mazePathListDigonal(p+'D',r-1,c-1));
        }
        return list;
    }

    public static void mazeRestriction(String p,boolean[][] maze ,int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if(r<maze.length-1)
        {
            mazeRestriction(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            mazeRestriction(p+'R',maze,r,c+1);
        }

    }
}
