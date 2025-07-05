import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr , int s, int e)
    {
        if(e-s==1)
        {
            return ;
        }

        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        merge(arr,s,mid,e);
    }
    public  static void merge(int[] arr,int start,int mid ,int end)
    {
        int[] mix= new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
