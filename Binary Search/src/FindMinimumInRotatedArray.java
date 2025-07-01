public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start =0 , end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && nums[mid] > nums[mid+1])
            {
                return nums[mid+1];
            }
            if(mid > start && nums[mid] < nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[start]>=nums[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return nums[0];
    }
}
