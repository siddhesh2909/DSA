//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class binarySearch {
    public static void main(String[] args) {
        int[] arr ={ 2,3,5 6,7, 12, 45};
        int target = 7;
        System.out.println(isFound(arr, target));
    }
    static boolean isFound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]< target){
                end = mid-1;
            }
            if(arr[mid] > target){
                start = mid+1;
            }
            if(arr[mid] == target){
                return true;
            }
        }
        return false;
    }
}