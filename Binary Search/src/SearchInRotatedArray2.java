public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int[] nums={2, 2, 2, 3, 1};
        int target=1;
        int pivot=findRotation(nums);
        boolean isPresent=false;
        if(pivot==-1)
        {
             isPresent=BinarySearch(nums, target,0,nums.length-1);
        }
        else if(nums[pivot]==target)
        {
            isPresent=true;
        }
        else if(nums[0]<=target)
        {
            isPresent=BinarySearch(nums, target,0,pivot-1);
        }
        else{
            isPresent=BinarySearch(nums, target,pivot+1,nums.length-1);
        }
        System.out.println(isPresent);

    }

    public static int findRotation(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(nums[start]==nums[mid] && nums[mid]==nums[end]){

                if(start < end && nums[start] > nums[start+1]){return start;}
                start++;
                if(end<start && nums[end-1] > nums[end]){return end-1;}
                end--;
            }
            else if(nums[start]> nums[mid]){end=mid-1;}
            else {start=mid+1;}
        }
       return -1;
    }
    public static boolean BinarySearch(int[] nums, int target , int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
