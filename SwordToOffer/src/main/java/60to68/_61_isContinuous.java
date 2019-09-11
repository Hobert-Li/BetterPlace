import java.util.Arrays;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 17:43</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _61_isContinuous {
    public boolean isContinuous(int[] nums) {
        if (nums.length < 5)
            return false;

        Arrays.sort(nums);

        int cnt = 0;
        for (int num : nums) {
            if (num == 0)
                cnt++;
        }
        for (int i = cnt;i < nums.length-1;i++) {
            if (nums[i + 1] == nums[i])
                return false;
            cnt = cnt - (nums[i + 1] - nums[i] - 1);
        }
        return cnt >= 0;
    }

    public static void main(String[] args) {
        _61_isContinuous solution = new _61_isContinuous();
        int[] nums = {1,0,3,4,5};
        System.out.println(solution.isContinuous(nums));
    }
}
