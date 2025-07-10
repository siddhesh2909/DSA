public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > end) {
                System.out.println(false);
                return;
            }
            end = Math.max(end, i + nums[i]);
        }

        System.out.println(true);
    }
}
