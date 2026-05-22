import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args)
    {
        int[] arr = {1,1,1};
        int k=2;

        int sum=0;
        int count=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int num : arr)
        {
            sum+=num;

            int rem = sum -k;

            if(map.containsKey(rem))
            {
                count+=map.get(rem);
            }

            map.put(sum , map.getOrDefault(sum,0)+1);
        }

        System.out.println(count);
//        int count=0;
//        for(int i=0; i< arr.length;i++)
//        {
//            int sum=0;
//            for(int j=i ; j< arr.length;j++)
//            {
//                sum+=arr[j];
//
//                if(sum==k)
//                {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
