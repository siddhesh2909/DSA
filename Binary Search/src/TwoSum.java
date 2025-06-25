public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                System.out.println((start + 1) + " " + (end + 1) + " = " + target);
                return;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println("No two numbers add up to the target.");
    }
}
