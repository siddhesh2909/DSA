public class personalwelth1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{3,2,1},{4,5,6},{7,8,9}};

        System.out.println(calc(arr));

    }
        static int calc(int[][] arr){
        int prev=0;
        for(int i=0;i<arr.length;i++){
            int wel=0;
            for(int j=0;j<arr[i].length;j++){
                wel+=arr[i][j];
            }
            if(wel > prev)
            {
                prev=wel;
            }
        }

        return prev;
        }
}
