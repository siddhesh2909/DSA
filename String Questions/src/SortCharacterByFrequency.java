import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String str="tree";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map.toString());
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b)-> b.getValue()-a.getValue());
        StringBuilder sb= new StringBuilder();
        for(Map.Entry<Character,Integer> entry: entryList){
            char ch=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());
    }
}
