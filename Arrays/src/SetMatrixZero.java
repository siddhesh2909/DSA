public class SetMatrixZero {
    public static void main(String[] args)
    {
        int[][] matrix= {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5} };
        int rows = matrix.length;
        int cols = matrix[0].length;
       int[] row = new int[matrix.length];
       int[] col = new int[matrix[0].length];

       for(int i=0; i< rows ; i++)
       {
           for(int j=0 ; j< cols ; j++)
           {
               if(matrix[i][j]==0)
               {
                   row[i]=1;
                   col[j]=1;
               }
           }
       }

        for(int i=0; i< rows ; i++)
        {
            for(int j=0 ; j< cols ; j++)
            {
                if(row[i] ==1 || col[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] ss : matrix) {

            for (int val : ss) {
                System.out.print(val + " ");
            }

            System.out.println();
        }

    }
}
