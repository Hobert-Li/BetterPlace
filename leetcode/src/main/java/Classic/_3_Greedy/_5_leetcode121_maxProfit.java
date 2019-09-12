package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 13:48
 */


public class _5_leetcode121_maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _5_leetcode121_maxProfit solution = new _5_leetcode121_maxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
