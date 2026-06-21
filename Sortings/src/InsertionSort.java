import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)
    {
        int nums[] ={5,2,4,6,1};
        int n = nums.length;
        for(int i=0 ; i< n-1 ; i++)
        {
            for( int j = i+1 ; j > 0 ;j-- )
            {
                if(nums[j] < nums[j-1]){
                    swap(nums , j , j-1);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums , int s , int e)
    {
        int temp = nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}
