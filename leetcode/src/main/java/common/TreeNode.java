package common;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/28 17:31
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode buildTree(TreeNode root, int depth) {
        if (depth == 0) {
            return null;
        }

        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        depth = depth - 1;
        buildTree(root.left, depth);
        buildTree(root.right, depth);
        return root;
    }
}