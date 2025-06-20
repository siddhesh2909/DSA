import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Currency in Rupee:");
        double c=sc.nextDouble();
        double Dollar=c/86.66;
        System.out.println("Rupee:"+ String.format("%.2f",Dollar) +" Dollar");
    }
}
