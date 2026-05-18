import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};

        List<List<Integer>> list = new ArrayList<>();

        for(int i =0; i<arr.length; i++)
        {
            List<Integer> temp = new ArrayList<>();

            for(int j=i ; j<arr.length ; j++)
            {
                temp.add(arr[j]);

                list.add(new ArrayList<>(temp));
            }
        }
        System.out.println(list);
    }}
