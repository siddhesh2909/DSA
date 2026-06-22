public class maximumNumberOfBallons {
    public static void main(String[] args)
    {
        String text ="loonbalxballpoon";

        int[] count = new int[26];

        for(char ch : text.toCharArray())
        {
            count[ch - 'a']++;
        }

        System.out.println(Math.min( Math.min(count['b'-'a'],count['a'-'a']),
                                     Math.min(
                                                Math.min(count['l'-'a']/2 ,count['o'-'a']/2),count['n'-'a'])));
    }
}
