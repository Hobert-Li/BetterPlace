package Classic._3_Greedy;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/11 16:30
 */


public class _9_leetcode665_checkPossibility {
    public boolean checkPossibility(int[] nums) {
        boolean use = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && !use) {
                use = true;
                if (i - 1 >= 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            } else if (nums[i] > nums[i + 1] && use){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _9_leetcode665_checkPossibility solution = new _9_leetcode665_checkPossibility();
        int[] nums = {2,3,3,2,4};
        System.out.println(solution.checkPossibility(nums));
    }
}
