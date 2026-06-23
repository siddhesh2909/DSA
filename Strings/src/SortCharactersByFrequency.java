import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args)
    {
        String s="tree";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Map.Entry<Character , Integer>> entryList =  new ArrayList<>(map.entrySet());

        entryList.sort((a,b)->b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character , Integer> entry : entryList)
        {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for(int i=0; i< freq;i++)
            {
                sb.append(ch);
            }

        }

        System.out.println(sb.toString());
    }
}
