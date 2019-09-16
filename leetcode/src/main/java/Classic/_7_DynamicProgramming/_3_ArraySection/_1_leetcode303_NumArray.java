package Classic._7_DynamicProgramming._3_ArraySection;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 12:45
 */


public class _1_leetcode303_NumArray {
    private int[] sum;
    public _1_leetcode303_NumArray(int[] nums) {
        this.sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        _1_leetcode303_NumArray obj = new _1_leetcode303_NumArray(nums);
        int i = 2;
        int j = 5;
        System.out.println(obj.sumRange(i, j));
    }
}
