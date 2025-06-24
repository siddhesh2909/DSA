import java.util.ArrayList;
import java.util.List;

public class luckyNumberinMetrix {
    public static void main(String[] args) {
        int[][] matrix= {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> result=new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int small=Integer.MAX_VALUE;;
            int colIndex=-1;
            for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j]<small){
                        small=matrix[i][j];
                        colIndex=j;
                    }
            }

            boolean ismax=true;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][colIndex]>small){
                    ismax=false;
                    break;
                }
            }
            if(ismax){
                result.add(small);
            }
        }
        System.out.println(result);
    }
}
