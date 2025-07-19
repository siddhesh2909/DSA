package Questions;

import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "()))";
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')')
            {
                if(!stack.isEmpty() && stack.peek() == '(')
                { stack.pop();}
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }

        }
        System.out.println(stack.size());
    }


}
