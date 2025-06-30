import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        if (n == 0) {
            System.out.println(Arrays.toString(nums1));
        }
        for (int i = 0; i < n; i++) {
            nums1[i+m] =nums2[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
