import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int i=nums[0];
        int j=nums[1];
        int k=nums[2];

        if (i>j && j>k) {
            int temp= i;
            i=k;
            k=temp;
            System.out.println(i +","+j+","+k);
        } else if ((i<j && j>k) ||(i>j && j<k || (i<j && j<k)) ) {
            int temp= j;
            j=k;
            k=temp;
            System.out.println(i +","+j+","+k);
        }

    }
}
