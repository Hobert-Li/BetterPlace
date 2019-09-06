package Classic.Sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/6 9:43
 */

public class _1_leetcode215_findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int l = 0;
        int h = nums.length - 1;
        k = nums.length - k;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) {
                break;
            } else if (j < k) {
                l = j + 1;
            } else if (j > k) {
                h = j - 1;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int l, int h) {
        int p = nums[l];
        int i = l;
        int j = h + 1;
        while (true) {
            while (nums[++i] < p && i < h);
            while (nums[--j] > p && l < j);
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        _1_leetcode215_findKthLargest solution = new _1_leetcode215_findKthLargest();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(solution.findKthLargest(nums, k));
    }
}
