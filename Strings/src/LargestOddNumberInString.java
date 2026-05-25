public class LargestOddNumberInString {

    public static void main(String[] args)
    {
        String num ="52124";

        for(int i = num.length()-1 ; i>=0;i--)
        {
            char ch=num.charAt(i);
            if((ch - '0')%2 ==1)
            {
                System.out.println(num.substring(0,i+1));
                break;
            }
        }
    }
}
