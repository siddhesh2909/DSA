import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums={2,2};
        int target = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            visited[i] = true;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > target) {
                list.add(nums[i]);
            }
        }

        System.out.println(list);
    }
}
