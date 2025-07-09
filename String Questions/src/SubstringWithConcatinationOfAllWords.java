import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatinationOfAllWords {
    public static void main(String[] args) {
        String s="barfoothefoobarman";
        String[] words = {"foo","bar"};

        List<Integer> list =new ArrayList<>();

        if(s.isEmpty() || words.length==0){
            System.out.println(list);;
        }

        int wordLen = words[0].length();
        int totalLen= wordLen * words.length;

        HashMap<String,Integer> wordCount = new HashMap<>();
        for(String str:words){
            wordCount.put(str, wordCount.getOrDefault(str,0)+1);
        }

        for(int i=0; i<s.length()-totalLen; i++){
            HashMap<String,Integer> Seen = new HashMap<>();
            int j=0;
            while(j<words.length){
                int start = i+j*wordLen;
                String part = s.substring(start,start+wordLen);
                if(!wordCount.containsKey(part)){
                break;
                }
                Seen.put(part,Seen.getOrDefault(part,0)+1);
                if(Seen.get(part)>wordCount.get(part)){
                    break;
                }
                j++;

            }
            if(j==words.length){
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
