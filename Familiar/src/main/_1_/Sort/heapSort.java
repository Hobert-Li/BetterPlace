package Sort;

import java.util.Arrays;

import static Sort.bubbleSort.swap;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/23 18:03
 */


public class heapSort {
    public static void heapSort(int[] nums) {
        int n = nums.length;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            sink(nums, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);
            sink(nums, i, 0);
        }
    }

    private static void sink(int[] nums, int n, int i) {
        while (2 * i + 1 < n) {
            int j = 2 * i + 1;
            if (j + 1 < n && nums[j + 1] > nums[j]) {
                j++;
            }
            if (nums[i] >= nums[j]) {
                break;
            }
            swap(nums, i, j);
            i = j;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6,7,9,3,2,4,5,1,8};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
