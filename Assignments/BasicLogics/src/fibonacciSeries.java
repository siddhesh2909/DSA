import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Series will be upto :");
        int num=sc.nextInt();

        int first =0;
        int second =1;
        System.out.println("Fibonaci Series : "+ first +" "+ second);
        for(int i=2;i<=num;i++){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}
