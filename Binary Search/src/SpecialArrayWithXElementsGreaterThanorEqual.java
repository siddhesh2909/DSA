import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqual {
    public static void main(String[] args) {
        int[] arr = {3,5};

        for(int i=0;i<=arr.length;i++){
            int count=0;
            for(int nums  : arr){
                if(nums >= i)
                {
                    count++;
                }
            }
            if(count == i)
            {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
