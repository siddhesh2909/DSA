public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(sqrt(n,p));
    }
    static double sqrt(int n,int p) {
        double root=0.0;
        int s=0;
        int e=n;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(mid*mid == n)
                return (double)mid;
            else if(mid*mid > n)
                e=mid-1;
            else {
                s=mid+1;
                root=mid;
            }
        }
        double incr=0.1;
        for(int i=0; i<p ; i++) {
            while(root*root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

    }

