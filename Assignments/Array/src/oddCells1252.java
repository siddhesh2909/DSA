public class oddCells1252 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][]indices = {{0,1},{1,1}};
        int[] row= new int[m];
        int[] col= new int[n];
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
