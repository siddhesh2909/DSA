public class floorNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6 ,7,9};
        int start = 0;
        int end = nums.length-1;
        int target= 5;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]< target){
                start = mid+1;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            if(nums[mid] == target){
                System.out.println(nums[mid]);
            }
        }
        System.out.println(nums[end]);
    }
}
