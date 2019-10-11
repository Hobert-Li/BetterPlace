package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/10 16:36
 */


public class _8_leetcode39_combinationSum {
    private int[] candidates;
    private List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return ret;
        }
        this.candidates = candidates;
        List<Integer> list = new ArrayList<>();
        findConbination(target, list, 0);
        return ret;
    }


    private void findConbination(int target, List<Integer> list, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ret.add(list);
        }

        for (int i = start; i < candidates.length; i++) {
            List<Integer> to_list = new ArrayList<>();
            to_list.addAll(list);
            to_list.add(candidates[i]);
            findConbination(target - candidates[i], to_list, i);
        }
    }

    public static void main(String[] args) {
        _8_leetcode39_combinationSum solution = new _8_leetcode39_combinationSum();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(JSON.toJSONString(solution.combinationSum(candidates, target)));
    }
}
