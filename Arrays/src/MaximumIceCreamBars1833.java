import java.util.Arrays;

public class MaximumIceCreamBars1833 {
    public static void main(String[] args)
    {
        int costs[] = {1,3,2,4,1};
        int coins=7;

        // Brute Force
        int count=0;
        Arrays.sort(costs);

        for(int cost : costs)
        {
            if(coins >= cost)
            {
                coins-= cost;
                count++;
            }else {
                break;
            }
        }

        System.out.println(count);

    }
}
