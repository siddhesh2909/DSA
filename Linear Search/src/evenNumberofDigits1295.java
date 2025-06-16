public class evenNumberofDigits1295 {
    public static void main(String[] args) {

        int[] arr= {12,1,4,1234};

        System.out.println(cnt(arr));
    }
    static int cnt(int[] arr){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(even(arr[i]))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int cnt=0;
        while(n>0)
        {
            cnt++;
            n=n/10;
        }
        return cnt%2==0 ;
    }
}
