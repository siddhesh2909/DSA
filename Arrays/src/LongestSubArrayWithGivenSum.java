import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k=15;
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum=0;
        int maxLen = 0;

        for(int i=0; i< arr.length ; i++)
        {
            sum+=arr[i];

            if(sum == k)
            {
                maxLen= i+1;
            }

            int rem = sum - k;

            if(map.containsKey(rem))
            {
                int len = i -map.get(rem);
                maxLen= Math.max(len,maxLen);
            }

            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);


//        int[] arr = {10, 5, 2, 7, 1, 9};
//        int maxLen = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int sum = 0;
//            int len=0;
//
//            for (int j = i; j < arr.length; j++) {
//
//                sum += arr[j];
//                len++;
//
//                if (sum == 15) {
//
//                   // int len = j - i + 1;
//                    maxLen = Math.max(maxLen, len);
//                }
//            }
//        }
//
//        System.out.println(maxLen);
    }
}