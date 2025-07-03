public class RotateSting {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println((s.length() == goal.length()) && (s + goal).contains(goal));
    }
}
