import java.util.Arrays;

public class MoveZerostoLast {
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,3,4,5,6,7,8,9};
        int index=0;
       for(int i: nums)
       {
           if(i!=0){
               nums[index++]= i;
           }
       }
       while (index<nums.length)
       {
           nums[index++]=0;
       }
        System.out.println(Arrays.toString(nums));
    }
}
