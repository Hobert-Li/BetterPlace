package Classic.DoublePointer;

import java.util.Arrays;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/5 17:37
 */

public class _5_leetcode88_merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ret = new int[m + n];
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (j < m + n) {
            if (i1 >= m) {
                ret[j] = nums2[i2++];
            } else if (i2 >= n) {
                ret[j] = nums1[i1++];
            } else if (nums1[i1] > nums2[i2]) {
                ret[j] = nums2[i2++];
            } else {
                ret[j] = nums1[i1++];
            }
            j++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = ret[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        _5_leetcode88_merge solution = new _5_leetcode88_merge();
        solution.merge(nums1, m , nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
