package Strings;

public class subseq {
    public static void main(String[] args) {
        sub("","abc");
    }
    public static void sub(String a ,String b) {
        if(b.isEmpty()) {
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        sub(a + ch , b.substring(1));
        sub(a , b.substring(1));

    }
}
