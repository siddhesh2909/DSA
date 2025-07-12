public class LongestPalindromicString {
    public static void main(String[] args) {
        String s="babad";
        int start=0;
        int end=0;

        if(s.isEmpty() || s.length()< 1)
        {
            System.out.println("Empty String");
        }
        for(int i=0;i<s.length();i++)
        {
            int len1= expand(s,i,i);
            int len2= expand(s,i,i+1);
            int len= Math.max(len1,len2);

            if(len > end - start)
            {
                start = i - (len - 1) / 2 ;
                end = i + len / 2;
            }
        }
        System.out.println(s.substring(start, end + 1));

    }
    public  static int expand(String s,int left,int right)
    {
       while (left >=0 && right < s.length() && s.charAt(left)==s.charAt(right))
       {
           left--;
           right++;
       }
       return right - left - 1;
    }
}
