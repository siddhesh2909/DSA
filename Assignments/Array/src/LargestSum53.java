public class LargestSum53 {
    public static void main(String[] args) {
        int[] nums= {2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
