public class IsomorphicString {
    public static void main(String[] args) {
        String s ="foo";
        String t="bar";
        int[] indexS = new int[200];
        int[] indexT = new int[200];

        for(int i=0;i<s.length();i++){
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]){
                System.out.println(false);
                return;
            }
            indexS[s.charAt(i)] = i+1;
            indexT[s.charAt(i)] = i+1;
        }
        System.out.println(true);

    }
}
