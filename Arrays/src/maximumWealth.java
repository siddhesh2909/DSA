import java.util.Arrays;
import java.util.Scanner;

public class maximumWealth {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();

        int[][] arr= new int[m][n];

        for(int i=0; i< m ; i++)
        {
            for(int j=0; j<n ; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;

        for(int i=0; i < m ; i++)
        {
            int sum=0;
            for(int j =0 ; j< n ; j++)
            {
                sum+=arr[i][j];
            }
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}
