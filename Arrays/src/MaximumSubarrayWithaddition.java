public class MaximumSubarrayWithaddition {
    public static void main(String[] args)
    {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int maxSum=nums[0];

        int start=0;
        int end=0;
        int tempStart=0;

        for(int i=0; i< nums.length; i++)
        {
            if(sum==0)
            {
                tempStart=i;
            }

            sum+=nums[i];

            if(sum >maxSum)
            {
                maxSum=sum;
                start=tempStart;
                end=i;
            }
            if(sum < 0)
            {
                sum=0;
            }
        }

        System.out.println(" Sum :" +maxSum);

        for(int i=start ; i<= end;i++)
        {
            System.out.println(nums[i]);
        }

    }
}
