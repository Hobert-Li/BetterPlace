package leetcode31_40;

import java.util.Arrays;

/**
 * <p>题目名字：34. 在排序数组中查找元素的第一个和最后一个位置</p>
 * <p>题目描述：给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。</p>
 * <p>题目示例：
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 * </p>
 *
 * @author Hobert-Li
 * @create 2020/2/4 14:34
 */

public class _34_findFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findLeftBound(nums, target);
        res[1] = findRightBound(nums, target);
        return res;
    }

    private int findLeftBound(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int h = nums.length -1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                if (m == 0 || nums[m - 1] != target) {
                    return m;
                } else {
                    h = m - 1;
                }
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return -1;
    }

    private int findRightBound(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                if (m == nums.length -1 || nums[m + 1] != target) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        _34_findFirstAndLastPositionOfElementInSortedArray solution = new _34_findFirstAndLastPositionOfElementInSortedArray();
        int[] nums = {2,2};
        int target = 3;
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }

}
