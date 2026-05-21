public class MaximumSubarray {
    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int maxSum=nums[0];
        for(int num : nums){
            sum+=num;
            maxSum=Math.max(sum,maxSum);

            if(sum < 0)
            {
                sum=0;
            }
        }

        System.out.println(maxSum);
    }
}
