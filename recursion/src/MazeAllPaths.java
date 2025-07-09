import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board=
                {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true},
                };
//        allPaths("",board,0,0);
        int[][] path=new int[board.length][board[0].length];
        allPathsSteps("",board,0,0,path,1);

    }
    public static void allPaths(String p, boolean[][] maze , int r, int c)
    {

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return;
        }
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
            maze[r][c]=false;
            allPaths(p+'D',maze,r+1,c);
            allPaths(p+'R',maze,r,c+1);
            allPaths(p+'U',maze,r-1,c);
            allPaths(p+'L',maze,r,c-1);
            maze[r][c]=true;
    }

    public static void allPathsSteps(String p, boolean[][] maze , int r, int c, int[][] path , int step)
    {

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return;
        }
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] arr : path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        allPathsSteps(p+'D',maze,r+1,c,path,step+1);
        allPathsSteps(p+'R',maze,r,c+1,path,step+1);
        allPathsSteps(p+'U',maze,r-1,c,path,step+1);
        allPathsSteps(p+'L',maze,r,c-1,path,step+1);
        maze[r][c]=true;
        path[r][c]=0;
    }
}
