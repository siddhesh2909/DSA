public class Fibonacii {
    public static void main(String[] args) {
        int n=7;
        int ans=fibo(7);
        System.out.println(simple(7));
    }
    public static int fibo(int n){
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }

    public static int simple(int n){
        int a=0,b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }


}
