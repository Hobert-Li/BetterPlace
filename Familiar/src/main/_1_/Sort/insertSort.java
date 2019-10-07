package Sort;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 17:46
 */


public class insertSort {
    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    bubbleSort.swap(nums, j , j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,4,5,2,3,1};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
