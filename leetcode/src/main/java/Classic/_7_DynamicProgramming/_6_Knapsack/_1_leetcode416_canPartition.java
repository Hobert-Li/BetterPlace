package Classic._7_DynamicProgramming._6_Knapsack;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/16 16:23
 */


public class _1_leetcode416_canPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        int C = sum / 2;

        boolean[] dp = new boolean[C + 1];
        for (int i = 0; i < C + 1; i++) {
            if (nums[0] == i) {
                dp[i] = true;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = C; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        _1_leetcode416_canPartition solution = new _1_leetcode416_canPartition();
        int[] nums = {1,5,11,5};
        System.out.println(solution.canPartition(nums));
    }
}
