import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrageArray2149 {
    public static void main(String[] args) {
        int[] nums ={3,1,-2,-5,2,-4};
        int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i: nums)
        {
            if(i>0)
            {
                ans[pos]=i;
                pos+=2;
            }
            else {
                ans[neg]=i;
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
//        List<Integer> list1=new ArrayList<>();
//        List<Integer> list2=new ArrayList<>();
//        for(int i: nums)
//        {
//            if(i > 0)
//            {
//                list1.add(i);
//            }
//            else
//            {
//                list2.add(i);
//            }
//        }
//        for(int i=0;i<list1.size();i++) {
//            nums[2 * i] = list1.get(i);
//            nums[2 * i + 1] = list2.get(i);
//        }
//        System.out.println(Arrays.toString(nums));
    }
}
