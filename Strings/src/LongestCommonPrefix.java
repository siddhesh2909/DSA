public class LongestCommonPrefix {
    public static void main(String[] args)
    {
        String[] s = {"flower","flow","flight"};

        if (s == null || s.length == 0)
            System.out.println("");
        for(int i=0; i< s[0].length() ; i++)
        {
            char ch = s[0].charAt(i);
            for(int j=1; j< s.length ;j++)
            {
                if(i >= s[j].length() || s[j].charAt(i) != ch)
                {
                    System.out.println(s[0].substring(0,i));
                    return;
                }
            }
        }

        System.out.println(s[0]);
    }
}
