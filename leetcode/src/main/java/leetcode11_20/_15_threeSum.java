package leetcode11_20;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * <p>题目名字： 15. 三数之和</p>
 * <p>题目描述： 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 * <p>例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * @author 李宏博
 * @create 2019/8/23 17:19
 */

public class _15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int start = i + 1;
            int end = nums.length-1;
            while (start < end) {
                if (nums[start] + nums[end] < target) {
                    start++;
                } else if (nums[start] + nums[end] > target) {
                    end--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    result.add(temp);
                    temp = null;
                    start++;
                    end--;
                }
            }
        }


        return new ArrayList<List<Integer>>(result);
    }

    public static void main(String[] args) {
        _15_threeSum solution = new _15_threeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(JSON.toJSONString(result));

    }
}
