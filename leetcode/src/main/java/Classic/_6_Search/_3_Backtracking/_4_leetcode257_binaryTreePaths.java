package Classic._6_Search._3_Backtracking;

import com.alibaba.fastjson.JSON;
import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 17:50
 */


public class _4_leetcode257_binaryTreePaths {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<String> ret = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return ret;
        }
        findPath(root, new StringBuilder());
        return ret;
    }

    private void findPath(TreeNode root, StringBuilder sb) {
        StringBuilder tosb = new StringBuilder();
        tosb.append(sb);
        if (root.left == null && root.right == null) {
            tosb.append(root.val);
            ret.add(tosb.toString());
        }

        tosb.append(root.val + "->");
        if (root.left != null) {
            findPath(root.left, tosb);
        }
        if (root.right != null) {
            findPath(root.right, tosb);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root5 = new TreeNode(5);
        root1.left = root2;
        root2.right = root5;
        root1.right = root3;

        _4_leetcode257_binaryTreePaths soltuion = new _4_leetcode257_binaryTreePaths();
        System.out.println(JSON.toJSONString(soltuion.binaryTreePaths(root1)));
    }
}
