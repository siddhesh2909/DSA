import java.util.Arrays;

public class NextPermutation {
    public static void reverse(int[] nums , int i , int j)
    {
        while(i<j)
        {
            swap(nums,i++,j--);
        }

    }
    public static void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args)
    {
        int[] nums ={1,2,3,4};

        int index=-1;
        int n= nums.length;

        for(int i=n-2 ; i>=0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                index =i;
                break;
            }
        }

        if(index == -1)
        {
            reverse(nums,0,n-1);
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i= n-1 ; i > index; i++)
        {


            if(nums[i] > nums[index])
            {
                swap(nums,index,i);
                break;
            }
        }
        reverse(nums,index+1,n-1);

        System.out.println(Arrays.toString(nums));
    }
}
