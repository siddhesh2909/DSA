public class validWord {
    public static void main(String[] args) {
        String word ="234Adas";
        System.out.println(isValid(word));
    }
    public static boolean isValid(String s) {
        int n = s.length();
        if (n < 3) {
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return vowels >= 1 && consonants >= 1;
    }
}
