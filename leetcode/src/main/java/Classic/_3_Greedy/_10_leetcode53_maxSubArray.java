package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 18:00
 */


public class _10_leetcode53_maxSubArray {
    public int maxSubArray(int[] nums) {
        int t = nums[0];
        int max = t;
        for (int i = 1; i < nums.length; i++) {
            if (t < 0) {
                t = nums[i];
            } else {
                t = t + nums[i];
            }
            max = Math.max(t, max);
        }
        return max;
    }

    public static void main(String[] args) {
        _10_leetcode53_maxSubArray solution = new _10_leetcode53_maxSubArray();
        int[] nums = {-2,1};
        System.out.println(solution.maxSubArray(nums));
    }
}
