import java.util.*;

public class JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int farthest = 0;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            int start = Math.max(i + minJump, farthest + 1);
            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0') {
                    if (j == n - 1) return true;
                    queue.offer(j);
                }
            }

            // Update farthest to avoid reprocessing
            farthest = Math.max(farthest, i + maxJump);
        }

        return n == 1 && s.charAt(0) == '0';
    }

    public static void main(String[] args) {
        JumpGameVII obj = new JumpGameVII();
        System.out.println(obj.canReach("011010", 2, 3));     // true
        System.out.println(obj.canReach("01101110", 2, 3));   // false
    }
}
