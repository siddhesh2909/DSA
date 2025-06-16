import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int i=100 ; i<1000; i++)
        {
            if(calc(i)){
                System.out.println(i);
            }
        }


    }
    static boolean calc(int a){
        int prev=a;
        if(a<100)
        {
            System.out.println("Enter a number greater than 100");
        }
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum=(rem*rem*rem)+sum;
            a=a/10;
        }
        return sum==prev;
    }
}

