import java.util.Arrays;
import java.util.List;

/**
 * <p>题目名字： 1.两数之和</p>
 * <p>题目描述： 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。</p>
 * <p>示例：给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * @author 李宏博
 * @create 2019/8/19 17:11
 */

public class _1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == temp) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        _1_twoSum solution = new _1_twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ret = solution.twoSum(nums, target);
        for (int i :ret) {
            System.out.print(i+" ");
        }
    }
}
