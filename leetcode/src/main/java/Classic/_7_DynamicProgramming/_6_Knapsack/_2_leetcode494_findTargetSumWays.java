package Classic._7_DynamicProgramming._6_Knapsack;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/16 17:52
 */


public class _2_leetcode494_findTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }

        int C = (sum + S) / 2;
        int[] dp = new int[C + 1];
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = C; j >= nums[i]; j--) {
                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }

        return dp[C];
    }

    public static void main(String[] args) {
        _2_leetcode494_findTargetSumWays solution = new _2_leetcode494_findTargetSumWays();
        int[] nums = {0,0,0,0,0,0,0,0,1};
        int S = 1;
        System.out.println(solution.findTargetSumWays(nums, S));
    }
}
