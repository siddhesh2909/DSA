public class rearrageCharacterToMakeTargetString {
    public static void main(String[] args)
    {
        String s="ilovecodingonleetcode";
        String target="code";

        int[] countS = new int[26];
        int[] countT= new int[26];

        for(char ch : s.toCharArray())
        {
            countS[ch -'a']++;
        }
        for(char ch : target.toCharArray())
        {
            countT[ch -'a']++;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<26 ; i++)
        {
            if(countT[i]>0)
            {
                ans= Math.min(ans , countS[i]/countT[i]);
            }
        }
        System.out.println(ans);
    }
}
