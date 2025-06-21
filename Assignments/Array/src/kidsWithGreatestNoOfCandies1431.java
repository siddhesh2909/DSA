import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithGreatestNoOfCandies1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies=3;
        int greatestCandies= Arrays.stream(candies).max().getAsInt();
        boolean[] arr = new boolean[candies.length];
        for(int i = 0; i < candies.length; i++){
                arr[i]= ((candies[i]+extraCandies)>= greatestCandies);
        }
        System.out.println(Arrays.toString(arr));

    }
}
