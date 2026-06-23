import java.util.Arrays;

public class Permutation {

    static void swap(int[] nums , int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]=temp;
    }
    static void permute(int[] nums , int index)
    {
        if(index == nums.length)
        {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i= index; i< nums.length ; i++)
        {
            swap(nums,index , i);

            permute(nums , index+1);

            swap(nums,index , i);
        }
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3};
        permute(nums, 0);
    }
}
