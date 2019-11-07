package leetcode21_30;

import java.util.Arrays;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 27. 移除元素</p>
 * <p>题目描述： 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * </p>
 *
 * <p>
 * 示例：
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/7 16:40
 */

//因为是去处元素，所以不用swap，直接覆盖就行了
public class _27_removeElement {
    public int removeElement(int[] nums, int val) {
        int now = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[now] = nums[i];
                now++;
            }
        }
        return now;
    }

    public static void main(String[] args) {
        _27_removeElement solution = new _27_removeElement();
        int[] nums = {2};
        int val = 3;
        System.out.println(solution.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
