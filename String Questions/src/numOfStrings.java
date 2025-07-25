public class numOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb" ;
        int count = 0;
        for(String str : patterns) {
            if(word.contains(str)) {
                System.out.println(str);
                count++;
            }
        }
        System.out.println(count);
    }
}
