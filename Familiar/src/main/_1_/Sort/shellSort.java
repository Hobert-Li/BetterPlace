package Sort;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 17:51
 */


public class shellSort {
    public static void shellSort(int[] nums) {
        int gap = 1;
        while (gap < nums.length / 3) {
            gap = 3 * gap + 1;
        }

        while (gap >= 1) {
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j >= gap ; j -= gap) {
                    if (nums[j] < nums[j - gap]) {
                        bubbleSort.swap(nums, j, j - gap);
                    }
                }
            }
            gap = gap / 3;
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,4,5,2,3,1};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
