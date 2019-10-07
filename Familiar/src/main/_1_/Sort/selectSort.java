package Sort;

import java.util.Arrays;

import static Sort.bubbleSort.swap;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 20:40
 */


public class selectSort {
    public static void selectSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            int maxi = i;
            for (int j = 0; j < i; j++) {
                if (nums[maxi] < nums[j]) {
                    maxi = j;
                }
            }
            swap(nums, maxi, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,4,5,2,3,1};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
