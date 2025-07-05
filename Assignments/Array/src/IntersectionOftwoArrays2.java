import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOftwoArrays2 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        List<Integer> list1=new ArrayList<>();
        for(int j=0;j<nums1.length;j++){
            for(int k=0;k<nums2.length;k++){
                if(nums1[j]==nums2[k]){
                    list1.add(nums1[j]);
                }
            }
        }
        System.out.println(list1);

    }
}
