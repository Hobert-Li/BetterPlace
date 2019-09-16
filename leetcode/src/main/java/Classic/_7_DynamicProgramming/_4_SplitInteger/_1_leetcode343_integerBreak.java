package Classic._7_DynamicProgramming._4_SplitInteger;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 13:45
 */


public class _1_leetcode343_integerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        _1_leetcode343_integerBreak solution = new _1_leetcode343_integerBreak();
        System.out.println(solution.integerBreak(10));
    }
}
