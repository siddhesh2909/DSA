public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pla(121));
    }
    public static boolean pla(int n){
        return n == rev(n);
    }
    public static int rev(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n, digits);
    }
    public static int helper(int n , int digits){
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10 , digits-1);
    }
}
