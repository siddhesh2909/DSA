import java.util.*;

public class RightIntervalFinder {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];

        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }
        Arrays.sort(starts, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int left = 0, right = n - 1;
            int index = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (starts[mid][0] >= end) {
                    index = starts[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = index;
        }

        return result;
    }

    public static void main(String[] args) {
        RightIntervalFinder rif = new RightIntervalFinder();

        int[][] intervals1 = {{3,4}, {2,3}, {1,2}};
        System.out.println(Arrays.toString(rif.findRightInterval(intervals1)));

        int[][] intervals2 = {{1,4}, {2,3}, {3,4}};
        System.out.println(Arrays.toString(rif.findRightInterval(intervals2)));
    }
}
