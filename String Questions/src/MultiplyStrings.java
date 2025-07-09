import java.util.Arrays;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1="498828660196";
        String num2="987654321";
        int len1=num1.length();
        int len2=num2.length();
        int[] res=new int[len1+len2];

        for(int i=len1-1;i>=0;i--){
            int digit1= num1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int digit2= num2.charAt(j)-'0';
                int product = digit1*digit2;
                int low=i+j+1;
                int high=i+j;

                int sum = product + res[low];
                res[low]= sum%10;
                res[high]+= sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:res){
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        System.out.println(sb.toString());

    }
}
