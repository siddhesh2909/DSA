import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,1,11,7};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
