import java.util.Scanner;

public class factorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        double factorial=1;
        for(int i=num;i>=1;i--){
                factorial *=i;
        }
        System.out.println(factorial);
    }
}
