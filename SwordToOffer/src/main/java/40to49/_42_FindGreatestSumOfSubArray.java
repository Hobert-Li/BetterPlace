/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/16 18:21
 */


public class _42_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int greatestSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int val : nums) {
            sum = sum <= 0 ? val : sum + val;
            greatestSum = Math.max(greatestSum,sum);
        }

        return greatestSum;
    }

    public static void main(String[] args) {
        _42_FindGreatestSumOfSubArray solution = new _42_FindGreatestSumOfSubArray();
        int[] nums = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(solution.FindGreatestSumOfSubArray(nums));
    }

}
