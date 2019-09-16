package Classic._4_BinarySearch;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/12 17:21
 */


public class _3_leetcode540_singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m % 2 == 1) {
                m--;
            }
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                h = m;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        _3_leetcode540_singleNonDuplicate solution = new _3_leetcode540_singleNonDuplicate();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(solution.singleNonDuplicate(nums));
    }
}
