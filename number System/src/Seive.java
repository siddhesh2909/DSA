public class Seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime = new boolean[n+1];
        primeNum(n,prime);
    }
    public static void primeNum(int n,boolean[] prime){

        for(int i=2; i*i<=n; i++){
            if(!prime[i]){
                for(int j=i*i; j<=n; j+=i){
                prime[j]=true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}
