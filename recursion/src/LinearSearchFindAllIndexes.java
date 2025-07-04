import java.util.ArrayList;
import java.util.List;

public class LinearSearchFindAllIndexes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,7,8,9,10};
        int target = 4;
        System.out.println(FindIndexes(arr,target));
    }
    public static String FindIndexes(int[] arr,int target){
        List<Integer> indexes = new ArrayList<>();
        return helper(arr,target,0,indexes);
    }
    public static String helper(int[] arr,int target,int index,List<Integer> indexes){
        if(index == arr.length){
            return indexes.toString();
        }
        if(arr[index] == target){
            indexes.add(index);
        }
        return helper(arr , target, index+1, indexes);
    }
}
