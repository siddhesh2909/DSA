public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num =14;
        if (num < 1)
        {
            System.out.println(false);
            return;
        }

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                System.out.println(true);
                return;
            }
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(false);
    }
}
