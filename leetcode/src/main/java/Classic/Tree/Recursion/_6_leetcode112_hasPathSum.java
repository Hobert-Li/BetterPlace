package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/29 14:07
 */

public class _6_leetcode112_hasPathSum {

    private boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            result = true;
            return true;
        }

        hasPathSum(root.left, sum - root.val);
        hasPathSum(root.right, sum - root.val);

        return result;
    }

    public static void main(String[] args) {
        _6_leetcode112_hasPathSum solution = new _6_leetcode112_hasPathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int sum = 1;
        System.out.println(solution.hasPathSum(root, sum));
    }
}
