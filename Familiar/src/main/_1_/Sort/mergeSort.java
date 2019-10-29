package Sort;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/23 17:42
 */


public class mergeSort {
    private static int[] aux;
    public static void mergeSort(int[] nums) {
        aux = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int m = l + (h - l) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, h);
        merge(nums, l, m, h);
    }

    private static void merge(int[] nums, int l, int m, int h) {
        int i = l;
        int j = m + 1;
        for (int k = l; k <= h; k++) {
            aux[k] = nums[k];
        }

        for (int k = l; k <= h; k++) {
            if (i > m) {
                nums[k] = aux[j++];
            } else if (j > h) {
                nums[k] = aux[i++];
            } else if (aux[i] > aux[j]) {
                nums[k] = aux[j++];
            } else {
                nums[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {6,7,9,3,2,4,5,1,8};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
