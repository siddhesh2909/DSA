import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n){//11
        if(n<=1)
        {
            return false;
        }
        int num=2;
        while(num*num<=n)
        {
            if(num%n==0)
            {
                return false;
            }
            num++;
        }
        return num*num>n;
    }
}
