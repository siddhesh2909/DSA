import java.util.Scanner;

public class IdenticalPairs {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i < n ; i++)
        {
            nums[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0; i<n;i++)
        {
            for(int j = i+1 ; j<n;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
