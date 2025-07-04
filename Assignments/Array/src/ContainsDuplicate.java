import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,4};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
        }
        System.out.println(set);
        if (set.size() < nums.length) {
            System.out.println(true);
        }
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length -1; i++) {
//            if(nums[i] == nums[i+1]){
//                System.out.println(true);
//            }
//        }
//        System.out.println(false);
    }
}
