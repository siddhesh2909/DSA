public class JumpGameTWO {
    public static void main(String[] args) {
        int[] nums= {2,3,1,1,4};
        int start=0, end =0,jumps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            end = Math.max(end,i+nums[i]);
            if(i == start)
            {
                jumps++;
                start=end;
            }
        }
        System.out.println(jumps);
    }
}
