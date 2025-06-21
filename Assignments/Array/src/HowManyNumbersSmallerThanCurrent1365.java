import java.util.Arrays;

public class HowManyNumbersSmallerThanCurrent1365 {
    public static void main(String[] args) {
        int[] nums ={8,1,2,2,3};
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int cnt=0;
            for(int j = 0; j < nums.length; j++){

                if(nums[i] > nums[j] && nums[i] != nums[j]){

                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        System.out.println(Arrays.toString(ans));
    }
}
