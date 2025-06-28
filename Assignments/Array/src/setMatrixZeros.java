import java.util.Arrays;

public class setMatrixZeros {
    public static void main(String[] args) {
        boolean zeroinFirstCol = false;
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) zeroinFirstCol = true;
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = matrix[0].length - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if (zeroinFirstCol) {
                matrix[row][0] = 0;
            }
        }
        for (int row=0; row<matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
    }


    }

