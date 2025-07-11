public class countRotations {
    public static void main(String[] args) {
        int[] nums = {10,11,12,4,5,6,7};
        System.out.println(count(nums));

    }
    public static int count(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid > start&& arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
