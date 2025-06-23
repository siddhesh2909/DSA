import java.util.Arrays;

public class transposeMetrix867 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] result = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
