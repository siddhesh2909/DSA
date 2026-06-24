public class LongeshPanlindromicSubstring {
   static int start=0;
  static   int maxLen=0;
    public static void main(String[] args)
    {
        String s = "abba";
        for(int i=0 ; i< s.length() ; i++)
        {
            expand(s,i,i);
            expand(s,i,i+1);

            System.out.println(s.substring(start,start+maxLen));
        }

    }
    public static void expand(String s, int left , int right)
    {
        while(left >=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        int len = right - left -1;
        if(len > maxLen)
        {
            maxLen = len;
            start=left+1;
        }
    }
}
