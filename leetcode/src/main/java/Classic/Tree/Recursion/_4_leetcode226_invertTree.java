package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 19:44
 */

public class _4_leetcode226_invertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(t);

        return root;
    }
}
