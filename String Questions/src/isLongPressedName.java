public class isLongPressedName {
    public static void main(String[] args) {
        String name="alex";
        String typed="aaleex";
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                System.out.println(false);
            }
        }
        System.out.println(i  == name.length());
    }
}
