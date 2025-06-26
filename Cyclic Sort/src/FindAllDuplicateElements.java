import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateElements {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int i=0;
        while (i<nums.length){
            int CorrectIndex = nums[i]-1;
            if(nums[i]!=nums[CorrectIndex]){
                int temp=nums[CorrectIndex];
                nums[CorrectIndex]=nums[i];
                nums[i]=temp;
            }
            else {
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        System.out.println(list);
    }
}
