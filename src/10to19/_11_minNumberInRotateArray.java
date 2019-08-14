/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 10:17</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _11_minNumberInRotateArray {
    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int l = 0,h = nums.length-1;
        while (l < h) {
            int m = l + (h-l)/2;
            if (nums[m] <= nums[h])
                h = m;
            else
                l = m + 1;
        }
        return nums[l];
    }

    public static void main(String[] args) {
        _11_minNumberInRotateArray solution = new _11_minNumberInRotateArray();
        int[] nums = {1,2,3,4,5,0};
        System.out.println(solution.minNumberInRotateArray(nums));
    }
}
