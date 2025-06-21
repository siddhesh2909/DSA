import java.util.Arrays;

public class FirstandLastPosition34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};;
        int target=7;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        res[0]= findindex(nums, target, true);
        res[1]= findindex(nums, target, false);
        return res;
    }
    static int findindex(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(nums[mid]<target)
            {
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else {
                index = mid;
                if(findFirst){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return index;
    }

}
