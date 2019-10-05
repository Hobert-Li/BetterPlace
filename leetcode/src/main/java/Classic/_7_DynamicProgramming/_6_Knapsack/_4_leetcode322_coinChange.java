package Classic._7_DynamicProgramming._6_Knapsack;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/18 17:36
 */

//已提交cyc
public class _4_leetcode322_coinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        _4_leetcode322_coinChange solution = new _4_leetcode322_coinChange();
        int[] coins = {3,4};
        int amount = 16;
        System.out.println(solution.coinChange(coins, amount));
    }
}
