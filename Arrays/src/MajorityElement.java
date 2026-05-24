import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args)
    {
    int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
//        HashMap<Integer , Integer> map = new HashMap<>();
//
//        for(int num : nums)
//        {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//            if(map.get(num) > nums.length/2)sh
//            {
//                System.out.println(num);
//                return;
//            }
//        }
//
//        System.out.println(-1);

        int candidate=0;
        int count=0;

        for(int num :nums)
        {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);

    }
}
