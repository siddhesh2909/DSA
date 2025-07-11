import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1};
        sort(arr , arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
   public static int[] sort(int[] arr , int r, int c) {
       if (r == 0) {
           return arr;
       }
       if (c < r)
       {
           if(arr[c] >arr[c+1])
           {
               int temp = arr[c];
               arr[c] = arr[c+1];
               arr[c+1] = temp;
           }
           return sort(arr , r, c+1);
       }
       else{
           return sort(arr , r-1, 0);
       }
   }
}
