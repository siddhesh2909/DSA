import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxCandies {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] candies = new int[n];
        for(int i=0; i<n; i++)
        {
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();

        int max= candies[0];

        for(int i=0; i<n ; i++)
        {
            if(candies[i] > max)
            {
                max= candies[i];
            }
        }

        List<Boolean> list = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            if((candies[i] + extraCandies) >= max)
            {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }

        System.out.println(list);

    }
}
