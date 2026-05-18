import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args)
    {
        int[] nums = {0,1,2,0,3,0,4};

        int index=0;
        for( int i=0; i< nums.length ; i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i]= nums[index];
                nums[index]=temp;
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
