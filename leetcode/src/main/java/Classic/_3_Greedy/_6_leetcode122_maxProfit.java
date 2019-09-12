package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 13:59
 */


public class _6_leetcode122_maxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                max = max + prices[i + 1] - prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _6_leetcode122_maxProfit solution = new _6_leetcode122_maxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
