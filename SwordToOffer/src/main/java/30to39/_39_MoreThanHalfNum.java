/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/8/15 17:46
 */


public class _39_MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int[] nums) {
        int majority = nums[0];
        for (int i = 1,cnt = 1; i < nums.length; i++) {
            cnt = nums[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = nums[i];
                cnt = 1;
            }
        }

        int cnt = 0;
        for (int val : nums) {
            if (val == majority)
                cnt++;
        }
        return cnt > nums.length / 2 ? majority : 0;
    }

    public static void main(String[] args) {
        _39_MoreThanHalfNum solution = new _39_MoreThanHalfNum();
        int[] nums = {1,2,3,2,2,2,5,4,2};
        System.out.println(solution.MoreThanHalfNum_Solution(nums));
    }
}
