package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 18:04
 */


public class _5_leetcode46_permute {
    private List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return ret;
        }
        List<Integer> list = new ArrayList<>();
        findAll(0, nums, list);
        return ret;
    }

    private void findAll(int i, int[] nums, List<Integer> list) {
        if (nums.length == 1) {
            list.add(nums[0]);
            ret.add(list);
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            int[] to_nums = new int[nums.length - 1];
            int ni = 0;
            int ti = 0;
            while (ti < to_nums.length) {
                if (ni == j) {
                    ni++;
                    continue;
                }
                to_nums[ti] = nums[ni];
                ti++;
                ni++;
            }

            List<Integer> to_list = new ArrayList<>();
            to_list.addAll(list);
            to_list.add(nums[j]);
            findAll(i + 1, to_nums, to_list);
        }
    }

    public static void main(String[] args) {
        _5_leetcode46_permute solution = new _5_leetcode46_permute();
        int[] nums = {1,2,3};
        System.out.println(JSON.toJSONString(solution.permute(nums)));
    }
}
