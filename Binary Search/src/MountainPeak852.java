public class MountainPeak852 {
    public static void main(String[] args) {
        int[] nums= {0,10,5,2};
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        System.out.println(nums[start]);
    }
}
