import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        int b=1;
        int cnt=2;
        list.add(a);
        list.add(b);
        while (cnt<=n){
            int temp = b;
            b= b+a;
            a=temp;
            list.add(b);
            cnt++;
        }
        System.out.println(list);

    }
}