import java.util.*;

public class LargestNumbeer {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LargestNumbeer sol = new LargestNumbeer();
        System.out.println(sol.largestNumber(new int[]{10, 2}));
        System.out.println(sol.largestNumber(new int[]{3, 30, 34, 5, 9}));
        System.out.println(sol.largestNumber(new int[]{0, 0}));
    }
}
