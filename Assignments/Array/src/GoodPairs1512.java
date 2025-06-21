public class GoodPairs1512 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int cnt=0;
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j])
               {
                   System.out.println(nums[i]+" "+nums[j]);
                   cnt++;
               }
           }
       }
       System.out.println(cnt);
    }
}
