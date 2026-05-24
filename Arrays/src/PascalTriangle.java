import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args)
    {
        int rowNumber =4;

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i< rowNumber; i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i ; j++)
            {
                if(j == 0 || i == j)
                {
                    row.add(1);
                }else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }


        System.out.println(triangle);
    }}
