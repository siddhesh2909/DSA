import java.util.*;

public class LeaderInArray {
    public static void main(String[] args)
    {
        int[] arr = {10, 22, 12, 3, 0, 6};

        List<Integer> list = new ArrayList<>();

        int maxFromRight = arr[arr.length-1];
        list.add(maxFromRight);

        for(int i= arr.length-2 ; i>=0 ; i--)
        {
            if(arr[i] > maxFromRight)
            {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        Collections.reverse(list);

        System.out.println(list);
    }
}
