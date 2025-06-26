import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[correctIndex];
                nums[correctIndex]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1){
                    list.add(j+1);
                }
        }
        System.out.println(list);
    }
}
