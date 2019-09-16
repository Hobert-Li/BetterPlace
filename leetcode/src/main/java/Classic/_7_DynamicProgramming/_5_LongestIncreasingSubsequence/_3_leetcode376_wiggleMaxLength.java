package Classic._7_DynamicProgramming._5_LongestIncreasingSubsequence;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/16 14:02
 */


public class _3_leetcode376_wiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int up = 1;
        int down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]){
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }

    public static void main(String[] args) {
        _3_leetcode376_wiggleMaxLength solution = new _3_leetcode376_wiggleMaxLength();
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(solution.wiggleMaxLength(nums));
    }
}
