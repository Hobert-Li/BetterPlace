package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/10 16:51
 */


public class _9_leetcode40_combinationSum2 {
    private int[] candidates;
    private List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        List<Integer> list = new ArrayList<>();
        boolean[] hasVisited = new boolean[candidates.length];
        findcombination(target, list, 0, hasVisited);
        return ret;
    }

    private void findcombination(int target, List<Integer> list, int start, boolean[] hasVisited) {
        if (target == 0) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i != 0 && candidates[i] == candidates[i - 1] && !hasVisited[i - 1]) {
                continue;
            }
            if (candidates[i] <= target) {
                list.add(candidates[i]);
                hasVisited[i] = true;
                findcombination(target - candidates[i], list, i + 1, hasVisited);
                hasVisited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        _9_leetcode40_combinationSum2 solution = new _9_leetcode40_combinationSum2();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(JSON.toJSONString(solution.combinationSum2(candidates, target)));
    }
}
