import java.util.Arrays;

public class KokoBanana {
    public static void main(String[] args) {
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1000000000;

        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
