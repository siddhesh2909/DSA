import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if(list1.contains(num)){
                list2.add(num);
            }
        }
        int[] arr = new int[list2.size()];
        int i = 0;
        for(int num:list2){
            arr[i++]=num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
