import java.util.Arrays;

public class seachIn2dArray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},
                      {4,5},
                      {6,7,8,9,}};
        int target=9;

        System.out.println(searcharr(arr, target));
    }

    static boolean searcharr(int[][] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.println((i+1)+" "+(j+1)+" "+target);
                    return true;
                }
            }
        }
        return false;
    }
}
