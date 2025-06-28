import java.util.Arrays;

public class RotateMatrixby90degree {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int[][] ans= new int[n][n];
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                ans[col][n-1-row]=matrix[row][col];
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=ans[row][col];
            }
        }
        for(int row=0;row<n;row++){
            System.out.println(Arrays.toString(matrix[row]));
        }
    }
}
