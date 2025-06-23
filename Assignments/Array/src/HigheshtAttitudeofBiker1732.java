import java.util.Arrays;

public class HigheshtAttitudeofBiker1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] sum=new int[gain.length+1];
        sum[0]=0;
        int max= 0;
        for(int i=1;i<sum.length;i++){
                sum[i]=sum[i-1]+gain[i-1];
                if(max<sum[i]){
                    max=sum[i];
                }
        }
        System.out.println(max);

    }
}
