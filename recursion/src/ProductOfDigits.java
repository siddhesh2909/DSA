public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
    public static int product(int n) {
        if(n%10 == n)
        {
            return n;
        }
        return n%10 *  product(n/10);
    }
}
