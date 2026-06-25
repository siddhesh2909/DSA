import java.util.ArrayList;

public class ReversePairs {
    public static void main(String[] args)
    {
        int[] nums={1,3,2,3,1};
        System.out.println(mergeSort(nums, 0, nums.length - 1));
    }
    public static int mergeSort(int[] nums, int low , int high)
    {
        int count=0;

        if(low>=high) return count;

        int mid = low +(high-low) / 2 ;

        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countPairs(nums , low , mid , high);

        merge(nums , low , mid , high);

        return count;
    }
    public static int countPairs(int[] nums, int low ,int mid, int high)
    {
        int right=mid+1;
        int cnt=0;

        for(int i= low ; i<=mid;i++)
        {
            while(right<=high && nums[i] > 2 * nums[right]) right++;
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
    public static void merge(int[] nums, int low ,int mid, int high)
    {
        ArrayList<Integer> mix = new ArrayList<>();
        int left=low;
        int right= mid+1;
        while(left<=mid && right <=high)
        {
            if(nums[left]<nums[right])
            {
                mix.add(nums[left++]);
            }else {
                mix.add(nums[right++]);
            }
        }
        while(left<=mid)
        {
            mix.add(nums[left++]);
        }
        while (right <=high)
        {
            mix.add(nums[right++]);
        }

        for(int i=low ; i<= high;i++)
        {
            nums[i] = mix.get(i-low);
        }

    }

}
