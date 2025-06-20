import java.util.Arrays;

public class concatArray1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = new int[2*(nums.length)];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%nums.length];
        }
        System.out.println(Arrays.toString(ans));
    }
}
