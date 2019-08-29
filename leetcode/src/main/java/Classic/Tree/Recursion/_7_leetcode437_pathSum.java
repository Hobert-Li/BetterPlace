package Classic.Tree.Recursion;

import common.TreeNode;

/**
 * <p>题目名字： </p>
 * <p>题目描述： </p>
 * <p>示例：</p>
 *
 * @author 李宏博
 * @create 2019/8/29 14:35
 */

public class _7_leetcode437_pathSum {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int ret =  pathSumStartWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return ret;
    }

    private int pathSumStartWithRoot(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        if (sum == root.val) {
            ret++;
        }
        ret += pathSumStartWithRoot(root.left, sum - root.val) + pathSumStartWithRoot(root.right, sum - root.val);
        return ret;
    }
}
