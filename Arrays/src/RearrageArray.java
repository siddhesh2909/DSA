import java.util.Arrays;

public class RearrageArray {
    public static void main(String[] args)
    {
        int[] nums={3,1,-2,-5,2,-4};
        int p=0;
        int n=1;

        int[] ans = new int[nums.length];

        for(int num : nums)
        {
            if(num > 0)
            {
                ans[p]=num;
                p+=2;
            }else {
                ans[n]=num;
                n+=2;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
