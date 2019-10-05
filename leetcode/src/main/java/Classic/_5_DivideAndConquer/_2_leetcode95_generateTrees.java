package Classic._5_DivideAndConquer;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/5 19:40
 */


public class _2_leetcode95_generateTrees {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            List<TreeNode> ret = new LinkedList<>();
            return ret;
        }
        
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> ret = new LinkedList<>();
        if (start > end) {
            ret.add(null);
            return ret;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateTrees(start, i - 1);
            List<TreeNode> right = generateTrees(i + 1, end);
            for (TreeNode lnode : left) {
                for (TreeNode rnode: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    ret.add(root);
                }
            }
        }
        return ret;
    }
}
