import java.util.HashMap;

public class CountNumberOfSubstringsWithDinctinctK {
    public static void main(String[] args)
    {
        String s= "pqpqs";
        int k=2;
        System.out.println(atMost(s,k)-atMost(s,k-1));
    }
    public static int atMost(String s , int k)
    {
        if(k < 0) return 0;
        int left=0;
        int count=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int right=0; right< s.length();right++)
        {
               char ch = s.charAt(right);
               map.put(ch,map.getOrDefault(ch,0)+1);
                while(map.size()> k)
                {
                    char leftChar = s.charAt(left);
                    map.put(leftChar,map.get(leftChar)-1);

                    if(map.get(leftChar)== 0)
                    {
                        map.remove(leftChar);
                    }
                    left++;
                }

               count+= right - left +1;
        }
        return count;
    }
}
