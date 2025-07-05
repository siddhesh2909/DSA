public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
    public static boolean isValid(String s) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    counter1++;
                }
                if(s.charAt(i) == '{') {
                    counter2++;
                }
                if(s.charAt(i) == '[') {
                    counter3++;
                }
                if(s.charAt(i) == ')') {
                    counter1--;
                }
                if(s.charAt(i) == '}') {
                    counter2--;
                }
                if(s.charAt(i) == ']') {
                    counter3--;
                }
        }
        if(counter1 == 0 && counter2 == 0 && counter3 == 0) {
            return true;
        }

         return false;
    }
}
