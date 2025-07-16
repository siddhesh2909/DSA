import java.util.ArrayList;
import java.util.List;

public class WordBreaks {
    public static void main(String[] args) {
        String s = "bb";
        List<String> wordDict  = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
//        int index=0;
//        int wordLen = wordDict.get(0).length();
//        for(int i=0; i < wordDict.size();i++){
//            String word = s.substring(index,wordLen);
//            System.out.println(word);
//            if(!wordDict.get(i).equals(word)){
//                System.out.println(false);
//                return;
//            }
//            index+=wordLen;
//            if(i<wordDict.size()-1){
//                wordLen += wordDict.get(i+1).length();
//            }
//
//        }
//        System.out.println(true);
        int n = s.length();
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if(dp[j] && wordDict.contains(sub) ) {
                    dp[i] = true;
                    break;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
