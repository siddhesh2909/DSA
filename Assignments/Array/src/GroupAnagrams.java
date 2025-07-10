import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();

        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            System.out.println(key);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}
