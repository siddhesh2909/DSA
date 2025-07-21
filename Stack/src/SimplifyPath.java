import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/.../a/../b/c/../d/./";
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String comp : arr) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            } else if (comp.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();



        System.out.println(sb.length() == 0 ? "/" : sb.toString());
    }
}
