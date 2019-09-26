package Classic._7_DynamicProgramming._7_Stocks;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 16:58
 */
//base case:
//  dp[-1][k][0] = 0;
//  dp[-1][k][1] = -infinity
//状态转移方程：
//  dp[i][k][0] = max(dp[i-1][k][0], dp[i-1][k][1] + prices[i])
//  dp[i][k][1] = max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i])


public class _1_leetcode121_maxProfit {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        _1_leetcode121_maxProfit solution = new _1_leetcode121_maxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
