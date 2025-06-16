import java.util.Scanner;

public class noofOccurenece {
    public static void main(String[] args) {
        int n = 33456;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count :");
        int n1 = sc.nextInt();
        int cnt = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == n1) {
                cnt++;
            }
            n = n / 10;
        }
        System.out.println(cnt);
    }

    }


