import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int numRows =5;
        List<List<Integer>> triangle=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {

                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }
        for (int i = 0; i < numRows; i++) {
            System.out.println(triangle.get(i));
        }
    }
}
