public class CountInversions {
    public static void main(String[] args)
    {
        int[] nums = {5,4,3,2,1};

        System.out.println(mergeSort(nums,0,nums.length-1));
    }
    public static int mergeSort (int[] nums , int low , int high)
    {
        int count=0;
        if(low>=high) return count;

        int mid = low + (high -low)/2;
        count+=mergeSort(nums,low ,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=merge(nums,low,mid,high);
        return count;
    }
    public static int merge(int[] nums , int low , int mid , int high)
    {
        int[] mix = new int[high-low+1];

        int left=low;
        int right= mid+1;
        int k=0;
        int count=0;
        while(left <= mid && right<=high)
        {
            if(nums[left]<nums[right])
            {
                mix[k++]=nums[left++];
            }else{
                mix[k++]=nums[right++];
                count+= mid - left +1;
            }
        }
        while(left <= mid)
        {
            mix[k++]=nums[left++];
        }
        while(right<=high)
        {
            mix[k++]=nums[right++];
        }

        for(int i = low ; i<= high; i++)
        {
            nums[i]= mix[i-low];
        }

        return count;
    }
}
