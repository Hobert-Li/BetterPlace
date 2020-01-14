package leetcode31_40;

import java.util.Arrays;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 31. 下一个排列</p>
 * <p>题目描述： 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * </p>
 *
 * <p>
 * 示例：
 * * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 *   1,2,3 → 1,3,2
 *   3,2,1 → 1,2,3
 *   1,1,5 → 1,5,1
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/12/2 11:13
 */
public class _31_nextPermutation {
    public void nextPermutation(int[] nums) {
        if (isMax(nums)) {
            Arrays.sort(nums);
            return;
        }

        int length = nums.length;
        int num = 0;
        int m = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            num += nums[i] * m;
            m = m * 10;
        }



    }

    private boolean isMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
