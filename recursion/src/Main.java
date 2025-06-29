//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     print(1);
    }
    public static void print(int i){
        if(i==5){
            System.out.println(5);;
            return;
        }
        System.out.println(i);
        print(i+1);
    }
}