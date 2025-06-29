import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==0){
                    List<Integer> list1 = new ArrayList<>();
                }
            }
        }
    }
}
