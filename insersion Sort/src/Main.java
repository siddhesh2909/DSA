import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int[] nums = {5,3,1,6,4};
            for(int i = 0; i < nums.length-1; i++){
                for(int j = i+1; j >0; j--){
                    if(nums[j] < nums[j-1]){

                        swap(nums ,j,j-1);
                    }
                    else{
                        break;
                    }
                }
            }
        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] arr,int num1 , int  num2)
    {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}