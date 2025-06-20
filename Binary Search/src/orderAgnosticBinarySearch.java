public class orderAgnosticBinarySearch {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr= {10,9,8,7,6,5,4,3,2,1};
        int target = 9;

        int result= findout(arr,target);
        if(result!=-1){
            System.out.println("The target number " + target + " is present in the array at " + result +"th Index");
        }
        else {
            System.out.println("The target number " + target + " is not present in the array");
        }

    }
    static int findout(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
        }
            else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
                return -1;

        }
    }
