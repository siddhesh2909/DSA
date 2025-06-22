public class SearchinRotatedArray {
    public static void main(String[] args) {
        int[] nums = {10, 12, 2, 3, 4, 5};
        int target = 4;

        int pivot = findRotate(nums);
        int result = -1;

        if (pivot == -1) {
            result = BinarySearch(nums, target, 0, nums.length - 1);
        }
        else if (nums[pivot] == target) {
            result = pivot;
        }
        else if (target>=nums[0]) //target >= nums[0] && target <= nums[pivot]
        {
            result = BinarySearch(nums, target, 0, pivot);
        } else {
            result = BinarySearch(nums, target, pivot + 1, nums.length - 1);
        }

        System.out.println("Target found at index: " + result);
    }

    public static int findRotate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
