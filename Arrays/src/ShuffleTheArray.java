import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr = new int[2*n];
        int[] ans = new int[2*n];
        for(int i =0; i < 2*n ; i++)
        {
            arr[i]= sc.nextInt();
        }
        int mid =  ans.length / 2 ;
        int index=0;
        for(int i=0; i < mid; i++ )
        {
            ans[index++] = arr[i];
            ans[index++] = arr[mid+i];
        }
        System.out.println(Arrays.toString(ans));


    }
}
