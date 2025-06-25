import java.util.Arrays;

public class Practice2DbinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 0 || cols == 0) {
            return new int[]{-1, -1};
        }

        // Perform binary search on each row
        for (int i = 0; i < rows; i++) {
            int[] result = binarySearch(arr[i], target);
            if (result[1] != -1) {
                return new int[]{i, result[1]};
            }
        }

        return new int[]{-1, -1}; // not found
    }

    // Binary search in 1D row
    public static int[] binarySearch(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] == target) {
                return new int[]{0, mid}; // return column index
            }

            if (row[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{0, -1}; // not found in this row
    }
}
