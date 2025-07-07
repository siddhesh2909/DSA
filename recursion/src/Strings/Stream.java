package Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "abdac");
    }
    public static void skip(String a, String b) {
        if(b.isEmpty())
        {
            System.out.println(a);
            return;
        }
        char ch= b.charAt(0);
        if(b.charAt(0) == 'a')
        {
            skip(a, b.substring(1));
        }
        else{
            skip(a+ch , b.substring(1));
        }
    }
}
