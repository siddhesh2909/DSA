public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (dfs(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) return false;
        if (board[row][col] != word.charAt(index)) return false;

        // mark cell as visited by replacing it temporarily
        char temp = board[row][col];
        board[row][col] = '#';

        boolean found =
                dfs(board, word, row + 1, col, index + 1) || // downb
                        dfs(board, word, row - 1, col, index + 1) || // up
                        dfs(board, word, row, col + 1, index + 1) || // right
                        dfs(board, word, row, col - 1, index + 1);   // left

        board[row][col] = temp; // backtrack

        return found;
    }
}
