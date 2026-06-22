import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args){
        String s ="anagram";
        String t ="nagaram";

        if(s.length()!=t.length())
        {
            System.out.println(false);
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        System.out.println(Arrays.equals(s1,t1));
     }
}
