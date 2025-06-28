public class pattern28 {
    public static void main(String[] args) {
        int n=4;
       for(int row=0 ; row < 2*n ;row++)
       {
           int column= row > n ? 2* n -row : row;
           int spaces= n - column;

           for(int s=0; s<spaces; s++)
           {
               System.out.print(" ");
           }

           for(int j=0; j< column; j++)
           {
               System.out.print("* ");
           }

           System.out.println();
       }
    }
}
