import java.util.Arrays;

public class MaximumElementAfterDecresingAndRearranging {
    public static void main(String[] args)
    {
        int[] arr = {2,2,1,2,1};

        Arrays.sort(arr);
        arr[0] = 1;
        for(int i=1 ; i <arr.length; i++ )
        {
            arr[i]=Math.min(arr[i],arr[i-1]+1);
        }

        System.out.println(arr[arr.length - 1]);
    }
}
