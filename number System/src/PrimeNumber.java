public class PrimeNumber {
    public static void main(String[] args) {
        int num=13;
        for(int i=1;i<=num;i++){
            System.out.println(i+" "+ isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
