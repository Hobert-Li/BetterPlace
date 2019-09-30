package Classic._7_DynamicProgramming._8_EditString;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/30 15:04
 */


public class _3_leetcode650_minSteps {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        _3_leetcode650_minSteps solution = new _3_leetcode650_minSteps();
        int n = 0;
        System.out.println(solution.minSteps(n));
    }
}
