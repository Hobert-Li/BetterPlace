package Classic._7_DynamicProgramming._7_Stocks;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 19:09
 */


public class _4_leetcode714_maxProfit {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0] - fee;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        _4_leetcode714_maxProfit solution = new _4_leetcode714_maxProfit();
        int[] prices = {1, 3, 2, 8, 4, 9};
        System.out.println(solution.maxProfit(prices, 2));
    }
}
