public class ExcelSheelColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        StringBuilder sb = new StringBuilder();
         while (columnNumber-- > 0){
             sb.insert(0,(char)(columnNumber%26 + 'A'));
             columnNumber /= 26;
         }

//        System.out.println(sb.toString());

         String columnTitle = "ZY";
         int ans=0;
         for(int i=0;i<columnTitle.length();i++){
             System.out.println(columnTitle.charAt(i)-'A');
             ans = ans* 26 + (columnTitle.charAt(i) - 'A' + 1);
         }
        System.out.println(ans);
    }
}
