package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 19:28
 */

public class _3_leetcode543_diameterOfBinaryTree {
    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = depth(root.left);
        int r = depth(root.right);
        max = Math.max(max, l + r);
        return Math.max(l, r);
    }
}
