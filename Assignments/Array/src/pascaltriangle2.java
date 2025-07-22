import java.util.ArrayList;
import java.util.List;

public class pascaltriangle2 {
    public static void main(String[] args) {
        int numRows =3;
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
        System.out.println(triangle.get(2));

//        List<Integer>Pascal=new ArrayList<>();
//        Pascal.add(1);
//        long val = 1;
//        for(int i=1;i<=rowIndex;i++)
//        {
//            val = val * (rowIndex-i+1);
//            val = val/i;
//            Pascal.add((int)val);
//        }
//        return Pascal;

    }
}
