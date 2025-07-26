public class SplitToStringsToMakePalindrome {
    public static void main(String[] args) {
        String a="ulacfd";
        String b="jizalu";

        System.out.println(check(a,b) || check(b,a));
    }
    public static boolean check(String a,String b){
        int left=0;
        int right=a.length()-1;
        while(left<right && a.charAt(left)==b.charAt(right)){
            left++;
            right--;
        }

        return isPalindrome(a,left , right) || isPalindrome(b,left , right);
    }
    public static boolean isPalindrome(String a,int left,int right){
        while (left<right){
            if (a.charAt(left)!=a.charAt(right)){
                return false;
            }
        }
        return true;
    }
}
