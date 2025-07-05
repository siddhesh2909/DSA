import java.util.Arrays;

public class threeSumClosest {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        int n=nums.length;
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-result)){
                    result=sum;
                }
                if(sum==target){
                    System.out.println(target);
                }
                else if(sum<target){
                    left++;
                }
                else {
                    right--;
                }
            }

        }
        System.out.println(result);
    }
}
