public class SquarerootOfNumber {
    public static void main(String[] args) {
        int x = 8;
        int start = 1;
        int end = x / 2;
        int ans = 0;

        if (x == 0 || x == 1) {
            System.out.println(x);
            return;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                System.out.println(mid);
                return;
            } else if (square < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
