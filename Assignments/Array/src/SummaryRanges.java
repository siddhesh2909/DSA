import java.util.*;
public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

        public static List<String> summaryRanges(int[] nums) {
           List<String> list = new ArrayList<>();
           if(nums.length==0){
               return list;
           }
           int start = nums[0];

           for( int i=1; i<=nums.length; i++){
               if( i == nums.length || nums[i]!=nums[i-1]+1){
                   if(start == nums[i-1])
                   {
                       list.add(String.valueOf(start));
                   }
                   else{
                       list.add(start+"->"+nums[i-1]);
                   }

                   if(i < nums.length){
                       start = nums[i];
                   }
               }
           }
           return list;
        }

}
