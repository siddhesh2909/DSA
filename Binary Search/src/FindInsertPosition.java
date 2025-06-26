public class FindInsertPosition {
    public static void main(String[] args) {
        int[] nums={1};
        int target=1;
        int start=0;
        int end=nums.length-1;
       for(int i=start;i<=end;i++){
           if(nums[i] >=target){
               System.out.println(i);
               return;
           }

        }
        if(nums[end]<=target)
        {
            System.out.println(end);
            return;
        }
        System.out.println(-1);

    }
}
