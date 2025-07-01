import java.util.Arrays;

public class ReversewordsinString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        s=s.trim();
        System.out.println("'"+s+"'");
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            result.append(words[i]);
            if(i!=0) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());

    }
}
