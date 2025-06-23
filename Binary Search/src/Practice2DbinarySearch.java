import java.util.Arrays;

public class Practice2DbinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(arr, 9)));

    }
    public static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        if(row == 0 || col == 0){
            return new int[]{-1, -1};
        }
        if(row== 1){
            return binarySearch(arr , 0,0,col-1 , target);
        }

    }
    public static int[] binarySearch(int[][] arr , int row , int cStart ,int  cEnd, int target){
        while(cStart <= cEnd){
            int middle = cStart+ (cEnd - cStart)/2;
            if(arr[row][middle] == target){
                return new int[]{row , middle};
            }
            if(arr[row][middle] < target){
                cStart = middle + 1;
            }
            else {
                cEnd = middle - 1;
            }
        }

    }



}
