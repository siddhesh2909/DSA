import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){

        int nums[] ={5,2,4,6,1};
        int n = nums.length;
        quick(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }

    static void quick(int[] nums, int low ,  int hi)
    {
        if(low >= hi)
        {
            return;
        }

        int s = low;
        int e = hi ;
        int mid = s+(e-s) /2 ;
        int pivot = nums[mid];

        while(s <= e)
        {
            while(nums[s] < pivot)
            {
                s++;
            }
            while(nums[e] > pivot)
            {
                e--;
            }

            if(s<=e)
            {
                int temp = nums[s];
                nums[s]= nums[e];
                nums[e]= temp;

                s++;
                e--;
            }
        }

        quick(nums , low ,e);
        quick(nums,s,hi);

    }
}
