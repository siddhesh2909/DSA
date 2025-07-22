public class AdditiveNumber {
    public static void main(String[] args) {
        String num = "199100199";
        System.out.println(num.length());
        int i=0;
        while(i<num.length()-2){
           int j = i+1;
           int k = j+1;
           int digit1 = num.charAt(i)-'0';
           int digit2 = num.charAt(j)-'0';
           int digit3 = num.charAt(k)-'0';
           if(digit1 + digit2 != digit3){
               System.out.println(false);
           }

           i++;
        }
    }
}
