import java.util.Arrays;

public class ReshapeMatrix566 {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1;
        int c=4;

        int[][] res=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        if(m*n !=r*c){
            return;
        }
        for(int i=0;i<r*c;i++){
            res[i/c][i%c]=mat[i/n][i%n];
        }
        for(int i=0;i<r;i++){System.out.println(Arrays.toString(res[i]));}
    }
}
