public class ReverseNumber {
//    static int sum=0;
//    public static void reverse(int n) {
//
//        if(n == 0)
//        {
//            return ;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        reverse(n/10);
//    }


    public static void main(String[] args) {
//        reverse(1234);
        System.out.println(reverse2(1234));
    }
    public static int reverse2(int n){
        int digits = (int)Math.log10(n);
        return helper(n, digits);
    }
    public static int helper(int n , int digits) {
        if(n %10 == n)
        {
            return n;
        }
        int rem=n%10;
        return rem * (int)Math.pow(10, digits) + helper(n / 10, digits - 1);
    }
    }

