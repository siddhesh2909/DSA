import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        quicksort(arr , 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e){

            while (arr[s]<pivot){
                    s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quicksort(arr, low, e);
        quicksort(arr,  s, high);

    }
}
