public class NumberOfStringThatAppearInSubstring {
    public static void main(String[] args)
    {
        String[] patterns={"a","abc","bc","d"};
        String word = "abc";
        int count = 0;
        for(String str : patterns) {
            if(word.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
