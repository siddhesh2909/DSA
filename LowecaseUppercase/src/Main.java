import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if( ch >='a' && ch <='z'){
            System.out.println("Lowecase");
        }
        else {
            System.out.println("Uppwecase");
        }
    }
}