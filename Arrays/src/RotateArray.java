import java.util.Arrays;

public class RotateArray {
    public static void main( String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;

        int n= arr.length;
        k = k %n;

        reverse(arr , 0, n-1);
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);

        System.out.println(Arrays.toString(arr));


    }

    public static void reverse(int[] arr , int s , int e){
        while(s<e)
        {
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
