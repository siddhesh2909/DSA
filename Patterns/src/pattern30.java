public class pattern30 {
    public static void main(String[] args) {
        int n=4;
        for(int row = 1; row <=n; row++)
        {
            for(int spaces = 1; spaces <=n -row; spaces++)
            {
                System.out.print(" ");
            }
            for(int col = row; col>=1; col--)
            {
                System.out.print(col);
            }
            for (int col = 2; col <=row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
