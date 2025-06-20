import java.util.Arrays;

public class runningSum1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        int[] ans = new int[nums.length];
//        int sum = nums[0];
//        ans[0]=sum;
//        for(int i=1;i<nums.length;i++)
//        {
//            sum+=nums[i];
//            ans[i]=sum;
//        }
//        System.out.println(Arrays.toString(ans));

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
