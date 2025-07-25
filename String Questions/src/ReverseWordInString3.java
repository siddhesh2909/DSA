import java.util.Arrays;

public class ReverseWordInString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] strings = s.split(" ");
        int i=0;
        StringBuffer sb = new StringBuffer();
        while(i<strings.length){
            for(int j = strings[i].length() -1; j>=0 ;j--){
                sb.append(strings[i].charAt(j));
            }
            sb.append(" ");
            i++;
        }

        System.out.println(sb.toString());
        sb.delete(sb.length()-1,sb.length());

    }

}
