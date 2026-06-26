import java.util.Arrays;

public class Peakelement2 {
    public static void main(String[] args)
    {
        int[][] mat = {
                {4, 2, 5, 1, 4, 5},
                {2, 9, 3, 2, 3, 2},
                {1, 7, 6, 0, 1, 3},
                {3, 6, 2, 3, 7, 2}
        };

        int row=mat.length;
        int col=mat[0].length;
        int left=0;
        int right=col-1;

        while(left<= right)
        {
            int mid = left+(right-left)/2;

            int maxRow=0;
            for(int i=0; i<row ; i++)
            {
                if(mat[i][mid] > mat[maxRow][mid])
                {
                    maxRow=i;
                }
            }

            int leftVal = (mid == 0) ? -1 : mat[maxRow][mid-1];
            int rightVal = (mid == col-1) ? -1 : mat[maxRow][mid+1];

            if(leftVal < mat[maxRow][mid] && rightVal < mat[maxRow][mid])
            {
                System.out.println(Arrays.toString(new int[]{maxRow,mid}));
                return;
            }

            if(leftVal > mat[maxRow][mid] )
            {
                right = mid-1;

            }else{
                left=mid+1;
            }

        }
        System.out.println(Arrays.toString(new int[]{-1,-1}));
    }
}
