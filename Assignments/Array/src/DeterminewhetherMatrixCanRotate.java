import java.util.Arrays;

public class DeterminewhetherMatrixCanRotate {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        for(int i = 0; i < 4; i++){
            if(isEqual(mat, target)){
                System.out.println(true);
                return;
//                return true;
            }
            mat=rotate(mat);
        }
        System.out.println(false);

    }
    public static int[][] rotate(int[][] mat)
    {
        int n = mat.length;
        int[][] matrix3 = new int[n][n];
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix3[j][n-1-i] = mat[i][j];
            }
        }
        return matrix3;
    }
    public static boolean isEqual(int[][] mat , int[][] target)
    {
        boolean isEqual=true;
        for(int i=0; i< mat.length; i++) {
            if(!Arrays.equals(mat[i], target[i])) {
                isEqual=false;
                break;
            }
        }
        return isEqual;
    }
}
