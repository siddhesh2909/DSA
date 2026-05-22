public class Rotate2DMatrixby90Degree {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int n = matrix.length;

        for(int i =0; i< n ;i++)
        {
            for(int j=i+1 ; j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i =0; i< n ;i++)
        {
            int s=0; int e=n-1;
            while(s<e)
            {
                int temp= matrix[i][s];
                matrix[i][s]= matrix[i][e];
                matrix[i][e]= temp;
                s++;
                e--;
            }
        }

        for (int[] row : matrix) {

            for (int val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }


    }
}
