import java.util.*;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        List<List<String>> allSolutions = new ArrayList<>();
        nQueen(board, 0, allSolutions);
        System.out.println(allSolutions);
    }

    public static void nQueen(boolean[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            solutions.add(getBoardAsList(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueen(board, row + 1, solutions);
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }

        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    public static List<String> getBoardAsList(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean col : row) {
                sb.append(col ? 'Q' : '.');
            }
            list.add(sb.toString());
        }
        return list;
    }
}
