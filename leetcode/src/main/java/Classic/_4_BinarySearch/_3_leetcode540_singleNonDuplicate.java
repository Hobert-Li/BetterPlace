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
            if (nums[m] == nums[m + 1]) {
                l = m + 1;
            } else if (nums[m] == nums[m - 1]) {
                h = m - 1;
            }
        }
        return nums[h];
    }

    public static void main(String[] args) {
        _3_leetcode540_singleNonDuplicate solution = new _3_leetcode540_singleNonDuplicate();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(solution.singleNonDuplicate(nums));
    }
}
