package Questions;
import java.util.Stack;

public class BalanceParenthesesUsingStack {

    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insertions = 0;
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push('(');
                i++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        insertions++;
                    }
                    i += 2;
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        insertions++;
                    } else {
                        insertions += 2;
                    }
                    i++;
                }
            }
        }

        insertions += 2 * stack.size();

        return insertions;
    }

    public static void main(String[] args) {
        BalanceParenthesesUsingStack obj = new BalanceParenthesesUsingStack();
        System.out.println(obj.minInsertions("(()))"));
        System.out.println(obj.minInsertions("())"));
        System.out.println(obj.minInsertions("))())("));
        System.out.println(obj.minInsertions("(((((("));
    }
}
