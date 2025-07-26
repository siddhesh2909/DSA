public class numWays {
    public static void main(String[] args) {
        String s = "100100010100110";
        int MOD = 1_000_000_007;
        int n = s.length();
        long totalOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        if (totalOnes % 3 != 0) System.out.println(0);;

        if (totalOnes == 0) {
            System.out.println((int)(((long)(n - 1) * (n - 2) / 2) % MOD));
        }

        long onesPerPart = totalOnes / 3;
        long firstCut = 0, secondCut = 0;
        long onesCount = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') onesCount++;

            if (onesCount == onesPerPart) firstCut++;
            else if (onesCount == 2 * onesPerPart) secondCut++;
        }

        System.out.println((int)((firstCut * secondCut) % MOD));
    }
}
