public class leetcode704BinarySearch {
    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        int target = 9;
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(-1);
    }

}
