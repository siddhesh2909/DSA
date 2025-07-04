import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        System.out.println(Arrays.toString(res));


        //------------------------------------
//        int[] res = new int[nums.length];
//        int n = nums.length;
//        int index = 0;
//        while(index<n){
//            int product=1;
//            for(int i=0;i<nums.length;i++){
//                    if(index == i)
//                    {
//                        continue;
//                    }
//                    product*=nums[i];
//            }
//            res[index++]=product;
//        }
//        System.out.println(Arrays.toString(res));


        //------------------------------------
//        int[] res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int product=1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                product *= nums[j];
//
//            }
//            res[i] = product;
//        }
//        System.out.println(Arrays.toString(res));

    }
}
