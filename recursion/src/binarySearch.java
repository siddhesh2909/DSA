public class binarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int ans=Search(arr ,5,0,arr.length-1);
        System.out.println(ans);
    }
    static int Search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return Search(arr,target,mid+1,end);
        }
        return Search(arr,target,start,mid-1);
    }
}
