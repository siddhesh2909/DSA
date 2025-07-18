import java.util.Arrays;

public class SearchIn2DMetrix2 {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {-1,3}
                };
//                {{1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}};


        System.out.println(Arrays.toString(searchmat(matrix,3)));

    }
    public static int[] searchmat(int[][] matrix, int target) {
        int row=0;
        int col = matrix[0].length - 1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            } else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }

        }
        return new int[] {-1, -1};
    }
}
