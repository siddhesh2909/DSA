class repeatedSubstringPattern {
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(repeatedSubstringPattern1(str));
    }
    public static boolean repeatedSubstringPattern1(String s) {
        String concatenated = s + s;
        return concatenated.substring(1, concatenated.length() - 1).contains(s);
    }
}