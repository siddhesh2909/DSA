import java.util.Scanner;

public class linerSearch {
    public static void main(String[] args) {
        int[] arr ={2,5,7,4,9};
        System.out.println("Enter Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int a : arr)
        {
            if(a==n) {
                System.out.println("Element Found ");
                return;
            }
        }
        System.out.println("Element Not Found ");

    }
}
