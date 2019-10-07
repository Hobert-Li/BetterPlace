package Sort;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 17:40
 */


public class bubbleSort {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,2,4,1,6};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
