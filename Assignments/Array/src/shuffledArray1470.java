import java.util.Arrays;

public class shuffledArray1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] arr = new int[nums.length];
        int mid=nums.length/2;
        int index=0;
        for(int i=0;i<mid;i++){
                arr[index++]=nums[i];
                arr[index++]=nums[i+mid];
        }
        System.out.println(Arrays.toString(arr));

    }
}
