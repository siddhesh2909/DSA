public class FindIndexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack="butsad";
        String needle="sad";
        int ans= find(haystack,needle,0);
        System.out.println(ans);
    }
    public static int find(String haystack, String needle ,int index) {
        if(haystack.isEmpty() || needle.isEmpty() ) {
            return -1;
        }
        if(haystack.startsWith(needle)) {
            return index;
        }
       return  find(haystack.substring(1), needle , index+1);

    }
}
