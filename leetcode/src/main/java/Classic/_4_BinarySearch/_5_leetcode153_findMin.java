package Classic._4_BinarySearch;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/14 17:14
 */


public class _5_leetcode153_findMin {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] > nums[h]) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        _5_leetcode153_findMin solution = new _5_leetcode153_findMin();
        int[] nums = {3,4,5,1,2};
        System.out.println(solution.findMin(nums));
    }
}
