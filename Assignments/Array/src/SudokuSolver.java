public class SudokuSolver {

    public static void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean solve(char[][] board) {
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                if(board[row][col] == '.') {
                    for(char ch = '1'; ch <= '9'; ch++) {
                        if(isValid(board,row,col,ch))
                        {
                            board[row][col] = ch;

                            if(solve(board))
                            {
                                return true;
                            }
                            board[row][col] = '.';
                        }

                    }
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int row, int col, char ch) {
        for(int i = 0; i < 9; i++) {
            if(board[row][i] == ch)
            {
                return false;
            }
            if(board[i][col] == ch)
            {
                return false;
            }
            int boxRow=3*(row/3)+ i/3;
            int boxCol=3*(col/3)+ i%3;
            if(board[boxRow][boxCol] == ch)
                {
                return false;
                }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Example usage
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
        printBoard(board);
    }
}
