package Strings;

import java.util.ArrayList;
import java.util.List;

public class subseq {
    public static void main(String[] args) {
        sub("","abc");
        System.out.println(sublist("","abc"));
        System.out.println(subseqAscii("","ab"));
    }
    public static void sub(String a ,String b) {
        if(b.isEmpty()) {
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        sub(a + ch , b.substring(1));
        sub(a , b.substring(1));

    }

    public static ArrayList<String> sublist(String a , String b) {
        if(b.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = b.charAt(0);
        ArrayList<String> right=sublist(a + ch , b.substring(1));
        ArrayList<String> left=sublist(a , b.substring(1));

        left.addAll(right);
        return left;

    }

    public static ArrayList<String> subseqAscii(String a , String b) {
        if(b.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = b.charAt(0);
        ArrayList<String> right=subseqAscii(a + ch , b.substring(1));
        ArrayList<String> left=subseqAscii(a , b.substring(1));
        ArrayList<String> ascii=subseqAscii(a + (ch+0) , b.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;

    }

}
