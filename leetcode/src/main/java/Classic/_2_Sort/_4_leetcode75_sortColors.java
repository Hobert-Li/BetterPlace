package Classic._2_Sort;

import java.util.Arrays;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/9 14:12
 */

public class _4_leetcode75_sortColors {
    public void sortColors(int[] nums) {
        int zero = -1;
        int i = 0;
        int j = nums.length;
        while (i < j) {
            if (nums[i] == 0) {
                swap(nums, ++zero, i++);
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums, --j, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        _4_leetcode75_sortColors solution = new _4_leetcode75_sortColors();
        int[] nums = {2,0,2,1,1,0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
