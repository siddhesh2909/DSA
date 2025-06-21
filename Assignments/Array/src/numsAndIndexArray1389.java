import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numsAndIndexArray1389 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        List<Integer> lst=new ArrayList<>();
        int[] target= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            lst.add(index[i],nums[i]);
        }
        for(int i: lst)
        {
            target[i]=lst.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
