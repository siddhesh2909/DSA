public class Palindrome {

    public static void main(String[] args) {
        String str = "abcdcba";
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start!=end)
            {
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);



//        StringBuilder sb = new StringBuilder();
//        sb.append("abcdcba");
//        if(sb.equals(sb.reverse())){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
    }
}
