import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Principle , rate , time(in years)");
        int principle=sc.nextInt();
        Float rate=sc.nextFloat();
        int time=sc.nextInt();
        float interest=(principle*rate*time)/100;
        System.out.println(interest);
    }
}
