import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args)
    {
        String s ="the sky is blue";

        String arr[] = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i= arr.length-1; i>=0 ; i--)
        {
            sb.append(arr[i]);
            if(i!=0)
            {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
