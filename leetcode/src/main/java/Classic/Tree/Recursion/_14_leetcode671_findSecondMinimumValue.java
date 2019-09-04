package Classic.Tree.Recursion;

import common.TreeNode;

import java.util.PriorityQueue;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/3 14:00
 */

public class _14_leetcode671_findSecondMinimumValue {
    private int min = -1;
    private int ret = -1;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (min == -1 && ret == -1) {
            min = root.val;
        } else if (min < root.val && root.val < ret && ret != -1) {
            ret = root.val;
        } else if (ret == -1 && root.val > min) {
            ret = root.val;
        }


        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);

        return ret;
    }

    public static void main(String[] args) {
        _14_leetcode671_findSecondMinimumValue solution = new _14_leetcode671_findSecondMinimumValue();
        Integer[] nums = {5, 8 , 5};
        TreeNode root = TreeNode.buildTreeByNums(nums);
        System.out.println(solution.findSecondMinimumValue(root));
    }
}
