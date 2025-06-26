public class findkthMissingValue {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11,12};
        int k=5;
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]-1-mid < k)
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        System.out.println(end+k);
    }
}
