public class RemoveOuterParenthesis {
    public static void main(String[] args)
    {
        String s ="(()())(())";
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                if(cnt>0)
                {
                    sb.append(c);
                }
                cnt++;
            } else if (c == ')') {
                if(cnt>0)
                {
                    sb.append(c);
                }
                cnt--;
            }
        }
    }
}
