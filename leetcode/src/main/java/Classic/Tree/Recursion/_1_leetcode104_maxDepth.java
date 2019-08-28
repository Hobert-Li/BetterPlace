package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 17:31
 */

public class _1_leetcode104_maxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        _1_leetcode104_maxDepth solution = new _1_leetcode104_maxDepth();
        TreeNode root = new TreeNode(0);
        TreeNode.buildTree(root, 4);

        System.out.println(solution.maxDepth(root));
    }
}
