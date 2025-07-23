public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
//        s = s.toLowerCase();
//        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch+32));
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
