public class IsomorphicString {
    public static void main(String[] args)
    {

        String s ="egg";
        String t ="add";

        int[] indexS = new int[128];
        int[] indexT= new int[128];

        for(int i =0; i< s.length() ;i++)
        {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)])
            {
                System.out.println( false);
            }
            indexS[s.charAt(i)] = i+1;
            indexT[t.charAt(i)]=i+1;
        }
        System.out.println(true);
    }

}
