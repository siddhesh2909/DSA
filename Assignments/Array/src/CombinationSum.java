import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        System.out.println(combinationSum(candidates,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombinations(candidates,target,0,new ArrayList<>() , 0,res);
        return res;
    }

    public static void makeCombinations(int[] candidates,int target,int index,List<Integer> comb ,int total , List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }
        if (total > target || index >= candidates.length) {
            return;
        }
        comb.add(candidates[index]);
        makeCombinations(candidates, target, index, comb, total + candidates[index], res);
        comb.remove(comb.size() - 1);
        makeCombinations(candidates, target, index + 1, comb, total, res);
    }
}
