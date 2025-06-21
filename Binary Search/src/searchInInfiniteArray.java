public class searchInInfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};

        int target=25;
        int ans=findans(nums,target);
        System.out.println(target+" Found at "+ans);
    }
    public static int findans(int[] nums, int target){
        int start=0;
        int end=1;
        while(target>end)
        {
            int temp= end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return calc(nums, target, start, end);
    }
    public static int calc(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
