public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board=
                {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true},
                };
        allPaths("",board,0,0);

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
}
