import java.util.Stack;

public class LongestValidParenthesisi {
    public static void main(String[] args) {
        String s="(()";
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);

                }
                else{
                    maxlen = Math.max(maxlen,i-stack.peek());
                }
            }
        }
        System.out.println(maxlen);
    }
}
