package Strings;

import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] arr1 ={1,2,2};
        System.out.println(subset(arr));
        System.out.println(subsetDuplicates(arr1));
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr)
        {
            int n = outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> Internal = new ArrayList<>(outer.get(i));
                Internal.add(num);
                outer.add(Internal);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subsetDuplicates(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 &&arr[i]==arr[i-1])
            {
                start=end+1;
            }
            end=outer.size()-1;
            int n = outer.size();
            for(int j=start;j<n;j++)
            {
                List<Integer> Internal = new ArrayList<>(outer.get(j));
                Internal.add(arr[i]);
                outer.add(Internal);
            }
        }
        return outer;
    }
}
