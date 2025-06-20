public class palindromeString {
    public static void main(String[] args) {
        String s="madam";
        String s1=rev( s);
        if(s1.equals(s))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
     static String rev(String s){
        String rev="";

        for(int i=s.length()-1;i>=0 ;i--){
            rev=rev + s.charAt(i);
        }
        return  rev;
     }

}
