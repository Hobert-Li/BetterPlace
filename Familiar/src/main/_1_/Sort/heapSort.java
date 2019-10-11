package Sort;

import java.util.Arrays;

import static Sort.bubbleSort.swap;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/10 14:01
 */


public class heapSort {
    public static void heapSort(int[] nums) {
        int n = nums.length;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            sink(nums, i, n);
        }
        for (int i = n - 1; i >  0; i--) {
            swap(nums, i, 0);
            sink(nums, 0, i);
        }
    }

    private static void sink(int[] nums, int i, int n) {
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
        int[] nums = {9,6,5,8,7,4,2,1,3};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
