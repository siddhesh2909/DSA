import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4};
        if (nums.length == 0) return;

        int insertPos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertPos++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
