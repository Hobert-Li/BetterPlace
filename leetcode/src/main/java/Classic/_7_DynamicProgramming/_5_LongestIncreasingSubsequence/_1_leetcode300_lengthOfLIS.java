package Classic._7_DynamicProgramming._5_LongestIncreasingSubsequence;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/16 12:30
 */

//能用二分搜索优化，未做
public class _1_leetcode300_lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int ret = 0;
        for (int i : dp) {
            ret = Math.max(ret, i);
        }

        return ret;
    }

    public static void main(String[] args) {
        _1_leetcode300_lengthOfLIS solution = new _1_leetcode300_lengthOfLIS();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(solution.lengthOfLIS(nums));
    }
}
