public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,6,2,4};
        System.out.println(xor(arr));
    }
    public static int xor(int[] arr){
        int unique=0;
        for(int i:arr)
        {
            unique^=i;
        }
        return unique;
    }
}
