import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        String[] words = s.split(" ");
        int maxLength = 0;

        for(String word:words){
            if(word.length()>maxLength){
                maxLength=word.length();
            }
        }

        List<String> result = new ArrayList<>();

        for(int i=0;i<maxLength;i++){
            StringBuilder sb = new StringBuilder();
            for(String str:words){
                if( i < str.length()){
                    sb.append(str.charAt(i));
                }
                else{
                    sb.append(' ');
                }
            }

            int j = sb.length()-1;
            while(j>=0 && sb.charAt(j) ==' '){
                j--;
            }
            result.add(sb.substring(0,j+1));
        }
        System.out.println(result);

    }
}
