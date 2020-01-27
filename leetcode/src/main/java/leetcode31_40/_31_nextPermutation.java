package leetcode31_40;

import java.util.Arrays;

/**
 * <p>题目名字：31. 下一个排列</p>
 * <p>题目描述：实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。</p>
 * <p>题目示例：以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1</p>
 *
 * @author Hobert-Li
 * @create 2020/1/27 13:49
 */

//关键例子：1，3，4，2 -> 1,4,2,3（由此得知需要排序）
public class _31_nextPermutation {
    public void nextPermutation(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                Arrays.sort(nums);
                return;
            } else if (nums[i - 1] < nums[i]) {
                Arrays.sort(nums, i, nums.length);
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, i - 1, j);
                        return;
                    }
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        _31_nextPermutation solution = new _31_nextPermutation();
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}
