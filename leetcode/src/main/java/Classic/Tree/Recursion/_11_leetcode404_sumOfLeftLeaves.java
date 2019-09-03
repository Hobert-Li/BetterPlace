package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/1 18:03
 */

public class _11_leetcode404_sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return func(root.left, true) + func(root.right, false);
    }

    private int func(TreeNode root, boolean b) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null && b) {
            return root.val;
        }

        int left = func(root.left, true);
        int right = func(root.right, false);

        return left + right;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        TreeNode root = TreeNode.buildTreeByNums(nums);
        _11_leetcode404_sumOfLeftLeaves solution = new _11_leetcode404_sumOfLeftLeaves();

        System.out.println(solution.sumOfLeftLeaves(root));
    }
}
