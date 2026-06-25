public class FindRepetingAndMissingNumber {
    public static void main(String[] args)
    {
        int[] nums = {3,5,4,1,1};

        long actualSum = 0;
        long actualSqSum=0;
        int n = nums.length;

        for(int i=0; i< nums.length; i++)
        {
            actualSum+=nums[i];
            actualSqSum += 1L * nums[i] * nums[i];
        }
        long expSum = 1L * n *(n +1 ) / 2;
        long expSqSum = 1L * n * (n + 1) * (2L * n + 1) / 6;

        long diff = actualSum - expSum;
        long sqDiff = actualSqSum - expSqSum;

        long sum = sqDiff / diff;

        int repeting = (int) ((diff + sum)/2);
        int missing = (int) (sum - repeting);

        System.out.println(repeting +" "+missing);
    }
}
