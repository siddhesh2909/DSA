import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char number = board[i][j];
                if(board[i][j] != '.') {
                    String rowKey= number+" in row"+i;
                    String colKely=number+" in column"+j;
                    String BoxKey= number+" in box"+i/3+"-"+j/3;
                    if(!seen.add(rowKey)|| !seen.add(colKely)|| !seen.add(BoxKey)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
