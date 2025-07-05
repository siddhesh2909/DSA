public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = value(s.charAt(i));
            if (i < s.length() - 1 && num < value(s.charAt(i + 1))) {
                res -= num;
            } else {
                res += num;
            }
        }

        System.out.println(res);
    }

    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
