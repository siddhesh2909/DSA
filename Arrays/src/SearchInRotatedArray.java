public class SearchInRotatedArray {
    public static void main(String[] args)
    {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;

        int low=0;
        int hi= nums.length-1;

        while(low<=hi)
        {
            int mid = low + (hi-low)/2;

            if(nums[low]<= nums[mid])
            {
                if(nums[low]<= target && target <= nums[mid])
                {
                    if (nums[low] == target) {System.out.println(low);return;}
                    if (nums[mid] == target) {System.out.println(mid);return;}
                    hi=mid-1;
                }else{
                    low=mid+1;
                }
            }else {
                if(nums[mid]<= target && target <= nums[hi])
                {
                    if (nums[hi] == target) {System.out.println(hi); return;}
                    if (nums[mid] == target) {System.out.println(mid);return;}
                    low=mid+1;
                }else{
                   hi=mid-1;
                }
            }
        }
        System.out.println(-1);
    }
}
