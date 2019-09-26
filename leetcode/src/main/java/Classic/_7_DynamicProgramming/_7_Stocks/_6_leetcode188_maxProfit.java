package Classic._7_DynamicProgramming._7_Stocks;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 19:43
 */


public class _6_leetcode188_maxProfit {
    public int maxProfit(int c,int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        if (c > prices.length/2) {
            int[][] dp = new int[prices.length][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            }
            return dp[prices.length - 1][0];
        }
        int[][][] dp = new int[prices.length][c+1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int k = 0; k < c; k++) {
                if (i == 0) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k+1][0] - prices[i]);
            }
        }
        return dp[prices.length-1][0][0];
    }

    public static void main(String[] args) {
        _6_leetcode188_maxProfit solution = new _6_leetcode188_maxProfit();
        int[] prices = {3,2,6,5,0,3};
        System.out.println(solution.maxProfit(2, prices));
    }
}
