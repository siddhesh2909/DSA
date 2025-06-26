import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums= {5,3,4,2,1};
        int i=0;
       while(i<nums.length){
           int correctIndex=nums[i]-1;
           if(nums[i]!=nums[correctIndex]){
                int temp=nums[correctIndex];
                nums[correctIndex]=nums[i];
                nums[i]=temp;
           }
           i++;
       }
        System.out.println(Arrays.toString(nums));
    }
}