public class RemoveOuterParenthesis {
    public static void main(String[] args)
    {
        String s ="(()())(())";
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                if(count> 0)
                {
                    sb.append(c);
                }
                count++;
            } else if (c == ')') {
                count--;
                if(count>0)
                {
                    sb.append(c);
                }
            }


        }
        System.out.println(sb);
    }
}
