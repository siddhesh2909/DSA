public class SprialMetrix2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] spiral = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = val++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = val++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = val++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = val++;
                }
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}
