import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                      List<Integer> list1= new ArrayList<>();
                      list1.add(nums[i]);
                      list1.add(nums[j]);
                      list1.add(nums[k]);
                      if(!list.contains(list1)) {
                          list.add(list1);
                      }

                    }
                }
            }

        }
        System.out.println(list);
    }
}

