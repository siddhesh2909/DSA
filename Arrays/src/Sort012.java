import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args)
    {
        int[] nums = {1, 0, 2, 1, 0};
        int low =0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
