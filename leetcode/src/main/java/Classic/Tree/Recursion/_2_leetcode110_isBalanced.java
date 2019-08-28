package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 18:27
 */

public class _2_leetcode110_isBalanced {

    static boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return result;
        }
        height(root);
        return result;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        if (Math.abs(lheight - rheight) > 1) {
            result = false;
        }
        return 1 + Math.max(lheight, rheight);
    }

    public static void main(String[] args) {
        _2_leetcode110_isBalanced solution = new _2_leetcode110_isBalanced();
        TreeNode root = new TreeNode(0);
        System.out.println(solution.isBalanced(root));
    }
}
