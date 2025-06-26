public class CountNegativeNumberInSortedMetrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int rows = grid.length;
        int count=0;
        for (int i = 0; i < rows; i++) {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);;
    }
}
