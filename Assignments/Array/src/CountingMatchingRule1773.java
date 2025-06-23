import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingMatchingRule1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey="color";
        String ruleValue="silver";
        int cnt = 0;
        int index = 0;

        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        }

    }

