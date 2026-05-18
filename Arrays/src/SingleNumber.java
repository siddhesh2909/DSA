public class SingleNumber {
    public static void main(String[] args)
    {
        int[] nums = {2,2,1};

        int ans=0;

        for(int num :nums)
        {
            ans^=num;
        }

        System.out.println(ans);
    }
}
