import java.util.Arrays;

public class FindFirstmissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int i=0;
        while(i<nums.length){
            int CorrectIndex = nums[i]-1;
            if(nums[i]> 0&& nums[i]<nums.length && nums[i]!=nums[CorrectIndex]){
                int temp=nums[CorrectIndex];
                nums[CorrectIndex]=nums[i];
                nums[i]=temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                System.out.println(j+1);
                return;
            }
        }
        System.out.println(nums.length+1);
    }
}
