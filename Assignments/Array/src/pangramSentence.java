public class pangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrowng";
        boolean[] check = new boolean[26];
        for(int i=0; i<sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                check[ch-'a']=true;
            }
        }
        boolean notseen=true;
        for(int i=0; i<26; i++)
        {
            if(!check[i])
            {
                notseen=false;
            }
        }
        System.out.println(notseen);
    }
}
