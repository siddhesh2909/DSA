import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter Operation(+,-,*,/,%):");
        Scanner sc = new Scanner(System.in);
        char op = sc.next().trim().charAt(0);
        if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {

            System.out.println("Enter Number 1:");
            int n1 = sc.nextInt();
            System.out.println("Enter Number 2:");
            int n2 = sc.nextInt();

            switch(op) {
                case '+':
                    int ans = n1 + n2;
                    System.out.println(ans);
                    break;
                case '-':
                    int ans1 = n1 - n2;
                    System.out.println(ans1);
                    break;
                case '*':
                    int ans2 = n1 * n2;
                    System.out.println(ans2);
                    break;
                case '/':
                    if (n1 < 0) {
                        System.out.println("Invalid Number 1St number should be greater than 0");
                    }
                    float ans3 = n1 / n2;
                    System.out.println(ans3);
                    break;
                case '%':
                    int ans4 = n1 % n2;
                    System.out.println(ans4);
                    break;
                    default:
                        System.out.println("Invalid Operation");
                        return;
            }
        }

    }
}
