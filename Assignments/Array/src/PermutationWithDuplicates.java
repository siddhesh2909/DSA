import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWithDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        System.out.println(permuteUnique(nums1));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums , new ArrayList<>(), ans , used);
        return ans;
    }
    public static void backtrack(int[] nums , List<Integer> list, List<List<Integer>> ans, boolean[] used){
        if (list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] &&  !used[i-1]){
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            backtrack(nums , list, ans, used);
            used[i] = false;
            list.remove(list.size()-1);
        }
    }
}
