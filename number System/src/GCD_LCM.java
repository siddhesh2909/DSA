public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(GCD(12,8));
        System.out.println(lcm(2,7));
    }
    static int GCD(int a,int b){
        if(a==0)
        {
            return b;
        }
        return GCD(b%a,a);
    }
    static int lcm(int a,int b){
        return (a*b)/GCD(a,b);
    }
}
