import java.util.Arrays;

public class Permutation {

    public static void permute(int[] nums , int index)
    {
        if(index == nums.length)
        {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i= index; i< nums.length ; i++)
        {
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i]=temp;

            permute(nums , index+1);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i]=temp;
        }
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3};
        permute(nums, 0);
    }
}
