public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(3100201));
    }
    public static int count(int n){
        return helper(n,0);
    }
    public static int helper(int n , int count){
        if(n==0)
        {
            return count;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
