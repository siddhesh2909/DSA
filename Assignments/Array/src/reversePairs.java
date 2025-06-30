public class reversePairs {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > 2 * nums[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
