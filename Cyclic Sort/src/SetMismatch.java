public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        int i=0;
        while(i<nums.length){
            int CorrectIndex = nums[i]-1;
            if(nums[i]!=nums[CorrectIndex]){
                int temp=nums[CorrectIndex];
                nums[CorrectIndex]=nums[i];
                nums[i]=temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                System.out.println(nums[j] +" "+(j+1));
            }
        }
    }
}
