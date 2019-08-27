/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/27 17:35
 */

public class quickSort {
    public void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int l, int h) {
        if (h <= l) {
            return;
        }

        int j = patition(nums, l, h);
        sort(nums, l, j - 1);
        sort(nums, j, h);
    }

    private int patition(int[] nums, int l, int h) {
        int i = l + 1,j = h;
        int v = nums[l];
        while (true) {
            while (nums[i] > v && i != h) {
                i++;
            }
            while (nums[j] < v && j != l) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, i);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        quickSort solution = new quickSort();
        int[] nums = {1,2,3,4,5};
        solution.sort(nums);
        for(int i:nums) {
            System.out.print(i+" ");
        }
    }
}
