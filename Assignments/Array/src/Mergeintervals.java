import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergeintervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

       for(int i=1;i<intervals.length;i++){
           if(intervals[i][0] <= end){
               end= Math.max(intervals[i][1],end);
           }
           else{
               list.add(new int[]{start,end});
               start = intervals[i][0];
               end = intervals[i][1];
           }
       }
       list.add(new int[]{start,end});
       list.toArray(new int[list.size()][]);
    }
}
