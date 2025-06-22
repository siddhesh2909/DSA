public class mountainPeakSearching1095 {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 2;
        int peak = findPeak(mountainArr);
        int ans = BinarySearch(mountainArr, target, 0 , peak);
        if(ans!=-1){
            System.out.println(ans);
        }
        else {
            ans = rBinarySearch(mountainArr, target, peak, mountainArr.length - 1);
            System.out.println(ans);
        }
    }

    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }

        }
        return start;
    }
    public static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            }

        }
        return -1;
    }
    public static int rBinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                start = mid+1;
            }
            if(arr[mid]<target){
                end = mid-1;
            }

        }
        return -1;
    }
}
