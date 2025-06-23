import java.util.Arrays;

public class RowCol2DsortedMatrixBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 7;
        System.out.println(Arrays.toString(searchmat(matrix,target)));
    }
    public static int[] searchmat(int[][] matrix, int target) {
        int row=0;
        int col= matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }

        }
        return new int[] {-1, -1};
    }
}
