import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] arr = {3,2,4};
        int target=7;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length;i++)
        {
            int rem = target-arr[i];

            if(map.containsKey(rem))
            {
                System.out.println(map.get(rem));
                System.out.println(i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
