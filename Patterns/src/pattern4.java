public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n;i++)
        {
            int col = i > n ? 2* n- 1 - i : i;
            for(int j=1;j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
