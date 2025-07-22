public class MaximalRectangle {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int MaxArea =0;
        int rows= matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols+1];

        for(char[] row : matrix)
        {
            for(int i=0; i< cols; i++){
                heights[i] = row[i] == '1' ? heights[i]+1 : 0;
            }
        int n = heights.length;

//            Stack<Integer> stack = new Stack<>();
//            for (int i = 0; i < heights.length; i++) {
//                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
//                    int h = heights[stack.pop()];
//                    int w = stack.isEmpty() ? i : i - stack.peek() - 1;
//                    maxArea = Math.max(maxArea, h * w);
//                }
//                stack.push(i);

        for(int i=0; i < n; i++){
            for(int j=i , minHeight = Integer.MAX_VALUE; j< n; j++)
            {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j-i+1);
                MaxArea = Math.max(area, MaxArea);
            }
        }
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        System.out.println(maximalRectangle(matrix));

    }
}
