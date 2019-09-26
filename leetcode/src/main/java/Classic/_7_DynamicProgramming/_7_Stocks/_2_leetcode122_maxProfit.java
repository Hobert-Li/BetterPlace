package Classic._7_DynamicProgramming._7_Stocks;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 18:52
 */


public class _2_leetcode122_maxProfit {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        _2_leetcode122_maxProfit solution = new _2_leetcode122_maxProfit();
        int[] prices = {1,2,3,4,5};
        System.out.println(solution.maxProfit(prices));
    }
}
