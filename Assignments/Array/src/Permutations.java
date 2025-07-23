import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        List<List<Integer>> ans = new ArrayList<>();
//        backtrack(nums,0,ans);
//        for (List<Integer> perm : ans) {
//            System.out.println(perm);
//        }
        int n=3;
        int k=5;
        int[] nums = new int[n];
        int num=1;
        for(int i=0; i< n;i++)
        {
            nums[i]=num++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums , 0 , ans);

        System.out.println(ans.get(k-1));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< n;i++)
        {
            sb.append(ans.get(k-1).get(i));
        }
        System.out.println(sb.toString());
    }
    public static void backtrack(int[] nums, int start, List<List<Integer>> ans) {
        if(start == nums.length){
            ans.add(arrtoList(nums));
            return;
        }
        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            backtrack(nums,start+1,ans);
            swap(nums,start,i);
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<Integer> arrtoList(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int num:nums){
            lst.add(num);
        }
        return lst;
    }
}
