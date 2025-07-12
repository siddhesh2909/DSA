public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
                {1, 1}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(findMinPath(grid, 0, 0, memo));
    }

    public static int findMinPath(int[][] grid, int r, int c, int[][] memo) {
        int m = grid.length;
        int n = grid[0].length;

        if (r >= m || c >= n) {
            return Integer.MAX_VALUE;
        }

        if (r == m - 1 && c == n - 1) {
            return grid[r][c];
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int right = findMinPath(grid, r, c + 1, memo);
        int down = findMinPath(grid, r + 1, c, memo);

        memo[r][c] = grid[r][c] + Math.min(right, down);
        return memo[r][c];
    }
}
