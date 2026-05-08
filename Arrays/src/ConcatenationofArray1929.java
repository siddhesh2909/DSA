import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray1929 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i < n ; i++)
        {
            nums[i]=sc.nextInt();
        }

        int len = 2*n;
        int[] ans = new int[len];

        for(int i=0; i < len  ; i++)
        {
            ans[i]=nums[i % n];
        }

        System.out.printf(Arrays.toString(ans));
    }
}
