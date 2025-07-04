public class SearchInArray {
    public static void main(String[] args) {
        int[] arr= {3,2,1,18,9};
        int target=11;
        System.out.println(isPresent(arr,target));
    }

    public static boolean isPresent(int[] arr,int target){
        return helper(arr , target, 0);
    }
    public static boolean helper(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }

        return  arr[index] == target || helper(arr , target , index+1 );
    }
}
