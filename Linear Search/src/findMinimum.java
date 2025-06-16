public class findMinimum {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2};

        System.out.println("Minimum No : "+findMin(arr));
    }
    static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]<min) {
                    min = arr[i];
                }
        }
        return min;
    }
}
