package leetcode11_20;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 18. 四数之和</p>
 * <p>题目描述： 给定一个包含 n 个整数的数组 nums 和一个目标值 target，
 * 判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * </p>
 *
 * <p>
 * 示例：
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/10/31 12:45
 */

//非最佳题解，且时间很大，但从代码本身来看时间复杂度也为O(n^2);
public class _18_fourSum {
    private HashMap<ArrayList<Integer>,Integer> dict = new HashMap<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j]));
                dict.put(list, nums[i] + nums[j]);
            }
        }
        for (Map.Entry e : dict.entrySet()) {
            ArrayList<Integer> list = (ArrayList<Integer>) e.getKey();
            int t = target - (Integer) e.getValue();
            ArrayList<Integer> numslist = new ArrayList<>();
            int i = 0;
            for (; i < nums.length; i++) {
                if (nums[i] != list.get(0)) {
                    numslist.add(nums[i]);
                } else {
                    i++;
                    break;
                }
            }
            for (; i < nums.length; i++) {
                if (nums[i] != list.get(1)) {
                    numslist.add(nums[i]);
                } else {
                    i++;
                    break;
                }
            }
            for (; i < nums.length; i++) {
                numslist.add(nums[i]);
            }

            int start = 0;
            int end = numslist.size() - 1;
            while (start < end) {
                if (numslist.get(start) + numslist.get(end) < t) {
                    start++;
                } else if (numslist.get(start) + numslist.get(end) > t) {
                    end--;
                } else if (numslist.get(start) + numslist.get(end) == t) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.addAll(list);
                    ans.add(numslist.get(start));
                    ans.add(numslist.get(end));
                    Collections.sort(ans);
                    res.add(ans);
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        _18_fourSum solution = new _18_fourSum();
        int[] nums = {0,0,0,0};
        int target = 0;
        System.out.println(JSON.toJSONString(solution.fourSum(nums, target)));
    }

}
