public class sumOfdigonalElementsin2Darray1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = mat.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res+=mat[i][i];;
            if(i!=(n-1-i))
            {
                res+=mat[i][n-1-i];
            }
        }
        System.out.println(res);
    }

}
