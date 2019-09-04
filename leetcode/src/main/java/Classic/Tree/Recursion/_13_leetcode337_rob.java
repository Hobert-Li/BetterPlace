package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/3 13:39
 */

public class _13_leetcode337_rob {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int cur = root.val;
        if (root.left != null) {
            cur += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            cur += rob(root.right.left) + rob(root.right.right);
        }

        int nocur = rob(root.left) + rob(root.right);
        return Math.max(cur, nocur);
    }
}
