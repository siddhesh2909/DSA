public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        int start = 0, end = n, result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long coinsNeeded = (long) mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                result = mid;
                break;
            } else if (coinsNeeded < n) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Complete rows: " + result);
//        int stair=1;
//        int count=0;
//        while(stair<=n)
//        {
//            n-=stair;
//            stair++;
//            count++;
//        }
//        System.out.println(count);


    }
}
