package Classic._7_DynamicProgramming._6_Knapsack;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/23 14:12
 */


public class _5_leetcode518_change {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < amount + 1; j++) {
                 if (coins[i] <= amount && j - coins[i] >= 0){
                     dp[j] = dp[j] + dp[j - coins[i]];
                }
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        _5_leetcode518_change solution = new _5_leetcode518_change();
        int amount = 5;
        int[] conins = {1, 2, 5};
        System.out.println(solution.change(amount, conins));
    }
}
