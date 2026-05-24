import com.sun.source.tree.UsesTree;

import java.util.*;

public class threesum {
    public static void main(String[] args)
    {
        int[] nums = {-1,0,1,2,-1,-4};

//        Set<List<Integer>> ans = new HashSet<>();
//
//        for(int i=0 ; i < nums.length ;i++)
//        {
//            HashSet<Integer> set = new HashSet<>();
//            for(int j=i+1 ; j<nums.length ; j++)
//            {
//                int third = -(nums[i]+nums[j]);
//                if(set.contains(third))
//                {
//                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
//                    Collections.sort(temp);
//                    ans.add(temp);
//                }
//                set.add(nums[j]);
//            }
//        }
//
//        System.out.println(ans
//        );

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i =0 ; i< nums.length ; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
