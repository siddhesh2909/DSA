import java.util.Arrays;

public class ValidAnagaram {
    public static void main(String[] args) {
        String s="abc";
        String t="acb";
        char[] arr1=s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
