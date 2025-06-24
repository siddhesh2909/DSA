import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addToArrayForm989 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0};
        int k = 34;
        List<Integer> res = new ArrayList<>();
        int i = nums.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += nums[i];
            }
            res.add(k % 10);
            k /= 10;
            i--;
        }

        Collections.reverse(res);
        System.out.println(res);
    }
}
