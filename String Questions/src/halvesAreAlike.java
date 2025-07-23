public class halvesAreAlike {
    public static void main(String[] args) {
        String s ="textbook";
        s= s.toLowerCase();
        char[] arr = s.toCharArray();
        int j = arr.length/2;
        int cnt1=0;
        int cnt2=0;
        for(int i=0 ; i<arr.length/2 && j <arr.length; i++){
            if(isVowel(arr[i]))
            {
                cnt1++;
            }
            if(isVowel(arr[j]))
            {
                cnt2++;
            }
            j++;
        }
        if(cnt1 == cnt2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
