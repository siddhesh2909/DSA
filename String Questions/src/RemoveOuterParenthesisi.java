public class RemoveOuterParenthesisi {
    public static void main(String[] args) {
        String s = "(()())";
        StringBuilder result = new StringBuilder();
        int count=0;
        for(char c: s.toCharArray())
        {
            if(c=='(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            }
           if(c==')') {
               count--;
               if (count > 0) {
                   result.append(c);
               }

           }
        }
        System.out.println(result);
    }
}
