package Classic._7_DynamicProgramming._6_Knapsack;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 15:12
 */


public class _7_leetcode377_combinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= target; i++) {
            for (int t : nums) {
                if (t <= i) {
                    dp[i] += dp[i - t];
                } else {
                    break;
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        _7_leetcode377_combinationSum4 solution = new _7_leetcode377_combinationSum4();
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(solution.combinationSum4(nums, target));
    }
}
