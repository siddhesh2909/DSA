import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};

         int start=0;
         int end=arr.length-1;

         while(start<end){
                swap(arr,start , end);
                start++;
                end--;
         }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}