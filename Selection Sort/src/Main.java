import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int[] arr = {5,3,1,7,2};
            for(int i=0; i<arr.length; i++){
                int last = arr.length-1-i;
                int max= findMaxIndex(arr ,0 , last);
                swap(arr ,max,last);
            }
        System.out.println(Arrays.toString(arr));
    }
    public static int findMaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}