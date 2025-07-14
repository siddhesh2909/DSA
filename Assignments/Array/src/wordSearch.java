import java.util.Arrays;

public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(isPresent(board , word));

    }
    public static boolean isPresent(char[][] board, String word) {
        char ch = word.charAt(0);
        for(char[] rows : board)
        {
            int index = Arrays.binarySearch(rows, ch);
            if(index > 0)
            {
                System.out.println(index);
            }
        }
        return true;
    }
}
