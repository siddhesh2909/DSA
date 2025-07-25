public class freqAlphabets {
    public static void main(String[] args) {
        String s = "10#11#12";
        int digit = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                digit = Integer.parseInt(s.substring(i, i + 2));
                char c = (char) ('a' + (digit - 1));
                sb.append(c);
                i += 3;
            } else {
                digit = s.charAt(i) - '0';
                char c = (char) ('a' + (digit - 1));
                sb.append(c);
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}
