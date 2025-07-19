package Questions;

import java.util.Arrays;

public class TwoStacks {

    public static int twostacks(int x, int[] a, int[] b) {
        return calculate(x, a, b, 0, 0);
    }

    public static int calculate(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count - 1;
        }

        int ans1 = 0, ans2 = 0;

        if (a.length > 0) {
            if (sum + a[0] <= x) {
                ans1 = calculate(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
            } else {
                ans1 = count;
            }
        }

        if (b.length > 0) {
            if (sum + b[0] <= x) {
                ans2 = calculate(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
            } else {
                ans2 = count;
            }
        }

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 4, 6, 1};
        int[] b = {2, 1, 8, 5};
        int x = 10;
        System.out.println(twostacks(x, a, b));
    }
}
