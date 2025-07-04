public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        return helper(arr,0);
    }
    public static boolean helper(int[] arr,int index){
        if(arr.length==0){
            return true;
        }
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr,index+1);
    }
}
