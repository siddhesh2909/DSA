import java.util.Arrays;
import java.util.HashMap;

public class SortingTheSequence {
    public static void main(String[] args) {
        String s= "is2 sentence4 This1 a3";
        String[] str = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        int start =0;
        for(int end = 1; end <s.length(); end++){
            char ch =s.charAt(end);
            if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                String result = s.substring(start, end);
                str[num-1] = result;
                start = end+2;
            }
        }
        String result = String.join(" ", str);
        System.out.println(result);




    }
}
