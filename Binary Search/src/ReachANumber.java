public class ReachANumber {
    public static void main(String[] args) {
        int target = 3 ;
        target = Math.abs(target);
        int sum = 0;
        int steps = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }
        System.out.println(steps);
    }
}
