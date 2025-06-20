import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Permutation1920 {
    public static void main(String[] args) {
        int[] arr ={0,2,1,5,3,4};
        int[] ans= new int[arr.length];
        for(int i : arr){
            ans[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}