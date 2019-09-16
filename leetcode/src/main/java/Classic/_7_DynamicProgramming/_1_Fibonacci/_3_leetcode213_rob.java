package Classic._7_DynamicProgramming._1_Fibonacci;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/14 21:21
 */


public class _3_leetcode213_rob {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    private int rob(int[] nums, int start, int end) {
        int[] dp = new int[end - start];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        int t = 2;
        for (int j = start + 2; j < end; j++) {
            dp[t] = Math.max(dp[t - 2] + nums[j], dp[t - 1]);
            t++;
        }

        return dp[t - 1];
    }

    public static void main(String[] args) {
        _3_leetcode213_rob solution = new _3_leetcode213_rob();
        int[] nums = {1,7,9,2};
        System.out.println(solution.rob(nums));
    }
}
