import java.util.Arrays;

public class SumUptoZero {
    public static void main(String[] args) {
        int n= 5;
        int[] result=new int[n];
        int num=1;
        for(int i = 0; i <n/2; i++) {
            result[i]=num;
            result[n-1-i]=-num;
            num++;
        }
        if(n%2!=0) {
            result[n/2]=0;
        }
        System.out.println(Arrays.toString(result));
    }
}
