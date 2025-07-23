import java.util.*;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            if (i < n) {
                fact *= i;
            }
        }
        
        k--;
        StringBuilder sb = new StringBuilder();
        
        for (int i = n - 1; i >= 0; i--) {
            int index = k / fact;
            sb.append(numbers.get(index));
            numbers.remove(index);
            
            if (i > 0) {
                k %= fact;
                fact /= i;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        PermutationSequence ps = new PermutationSequence();
        System.out.println(ps.getPermutation(3, 3));
        System.out.println(ps.getPermutation(4, 9));
        System.out.println(ps.getPermutation(3, 1));
    }
}
