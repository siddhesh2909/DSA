import java.util.ArrayList;
import java.util.List;

public class mobilepad {
    public static void main(String[] args) {
        letterCombinationss("","23");
        System.out.println(letterCombinations("","12"));


    }
    public static void letterCombinationss(String str , String digit){
        if(digit.isEmpty())
        {
            System.out.println(str);
            return;
        }
        int d = digit.charAt(0) - '0';
        for(int i=(d-1)*3 ; i<d*3; i++)
        {
            char ch = (char)('a'+i);
            letterCombinations( str + ch ,digit.substring(1));

        }
    }
    public static List<String> letterCombinations(String str , String digit){
        if(digit.isEmpty())
        {
            List<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int d = digit.charAt(0) - '0';
        for(int i=(d-1)*3 ; i<d*3; i++)
        {
            char ch = (char)('a'+i);
            ans.addAll(letterCombinations( str + ch ,digit.substring(1)));
        }
        return ans;
    }

}
