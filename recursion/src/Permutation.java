import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        perm("","abc");
        System.out.println(permutaton("","abc"));
        System.out.println(count("","abc"));
    }
    public static void perm(String a , String b){
        if(b.isEmpty())
        {
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        for (int i = 0; i <= a.length(); i++) {
            String f = a.substring(0, i);
            String s = a.substring(i);
            perm(f + ch + s, b.substring(1));
        }
    }

    public static ArrayList<String> permutaton(String a , String b){
        if(b.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = b.charAt(0);
        for (int i = 0; i <= a.length(); i++) {
            String f = a.substring(0, i);
            String s = a.substring(i);
            ans.addAll(permutaton(f + ch + s, b.substring(1)));
        }
        return ans;
    }

    public static int count(String a , String b){
        if(b.isEmpty())
        {
            return 1;
        }
        int count = 0;
        char ch = b.charAt(0);
        for (int i = 0; i <= a.length(); i++) {
            String f = a.substring(0, i);
            String s = a.substring(i);
            count =count + (count(f + ch + s, b.substring(1)));
        }
        return count;
    }
}
