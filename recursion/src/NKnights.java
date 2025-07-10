public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nKnights(board,0,0,4);
        System.out.println(count);
    }
    static int count=0;
    public static void nKnights(boolean[][] board, int r, int c,int knights){
        if(knights==0){
            count++;
            display(board);
            System.out.println();
            return;
        }
        if(r == board.length-1 && c == board.length ){
            return;
        }
        if(c==board.length){
            nKnights(board,r+1,0,knights);
            return;
        }
        if(isSafe(board,r,c))
        {
            board[r][c]=true;
            nKnights(board,r,c+1,knights-1);
            board[r][c]=false;
        }
        nKnights(board,r,c+1,knights);
    }
    public static boolean isSafe(boolean[][] board, int r, int c){
        if(isValid(board,r-2,c-1))
        {
            if(board[r-2][c-1])
            {
                return false;
            }
        }
        if(isValid(board,r-1,c-2))
        {
            if(board[r-1][c-2])
            {
                return false;
            }
        }
        if(isValid(board,r-1,c+2))
        {
            if(board[r-1][c+2])
            {
                return false;
            }
        }
        if(isValid(board,r-2,c+1))
        {
            if(board[r-2][c+1])
            {
                return false;
            }
        }
        return true;

    }
    public static boolean isValid(boolean[][] board, int r, int c){
        if(r>= 0 && r<board.length && c >=0 && c < board.length)
        {
            return true;
        }
        return false;
    }
    public static void display(boolean[][] board){
        for(boolean[] row : board)
        {
            for(boolean col : row)
            {
                if(col)
                {
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

    }
}
