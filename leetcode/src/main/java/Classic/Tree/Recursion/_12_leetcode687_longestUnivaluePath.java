package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/9/3 10:06
 */

public class _12_leetcode687_longestUnivaluePath {

    private int path = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }

    private int dfs(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        int leftPath = root.left != null && root.left.val == root.val ? left + 1 : 0;
        int rightPath = root.right != null && root.right.val == root.val ? right + 1 : 0;
        path = Math.max(path, leftPath + rightPath);//?
        return Math.max(leftPath, rightPath);
    }

    public static void main(String[] args) {
        _12_leetcode687_longestUnivaluePath solution = new _12_leetcode687_longestUnivaluePath();
        Integer[] nums = {5,4,5,1,1,5};
        TreeNode root = TreeNode.buildTreeByNums(nums);
        System.out.println(solution.longestUnivaluePath(root));
    }
}
