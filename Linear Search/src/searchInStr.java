public class searchInStr {

    public static void main(String[] args) {
        String str = "";
        char target = 'e';
        System.out.println(isPresent(str, target));
    }
    static boolean isPresent(String str, char target) {
        if(str.isEmpty()){
            System.out.println("Enter a Valid string");
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
