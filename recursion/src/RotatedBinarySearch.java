public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1};
        System.out.println(isPresent(arr, 1));
    }

    public static boolean isPresent(int[] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    public static boolean helper(int[] arr, int target, int start, int end) {
        if (start > end) return false;

        int mid = (start + end) / 2;

        if (arr[mid] == target) return true;

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return helper(arr, target, start, mid - 1);
            } else {
                return helper(arr, target, mid + 1, end);
            }
        }

        if (arr[mid] <= arr[end]) {
            if (target > arr[mid] && target <= arr[end]) {
                return helper(arr, target, mid + 1, end);
            } else {
                return helper(arr, target, start, mid - 1);
            }
        }

        return false;
    }
}
