import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};

        int count =0;
        int curr = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1])
            {
                count =0;
                nums[curr++] = nums[i];
            }
            else {
                count++;
                if(count<= 1)
                {
                    nums[curr++] = nums[i];
                }
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(curr);
//        int k = 0;
//        Map<Integer , Integer> map = new HashMap<>();
//
//        for(int num : nums)
//        {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//            if(map.get(num)<=2)
//            {
//                nums[k++]= num;
//            }
//
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(k);
    }
}
