import java.util.Arrays;

public class uniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}};

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        for(int[] row : memo){
            System.out.println(Arrays.toString(row));
        }

        System.out.println(uniquePath(obstacleGrid,0,0 ));
        System.out.println(countPaths(obstacleGrid, 0, 0, memo));;
    }
    public static int uniquePath(int[][] obstacles, int r, int c) {
        if (r >= obstacles.length || c >= obstacles[0].length || obstacles[r][c] == 1) {
            return 0;
        }

        if (r == obstacles.length - 1 && c == obstacles[0].length - 1) {
            return 1;
        }

        int down = uniquePath( obstacles, r + 1, c);

        int right = uniquePath(obstacles, r, c + 1);

        return down + right;
    }
    private static int countPaths(int[][] grid, int r, int c, int[][] memo) {
        int m = grid.length;
        int n = grid[0].length;

        if (r >= m || c >= n || grid[r][c] == 1) {
            return 0;
        }

        if (r == m - 1 && c == n - 1) {
            return 1;
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int down = countPaths(grid, r + 1, c, memo);
        int right = countPaths(grid, r, c + 1, memo);

        memo[r][c] = down + right;
        return memo[r][c];
    }
}
