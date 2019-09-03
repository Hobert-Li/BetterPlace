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

    public static TreeNode buildTreeByNums(Integer[] nums) {
        return buildTreeByNums(nums, 0);
    }

    private static TreeNode buildTreeByNums(Integer[] nums, int i) {
        TreeNode node = null;
        if (i < nums.length) {
            Integer value = nums[i];
            if (value == null) {
                return null;
            }

            node = new TreeNode(value);
            node.left = buildTreeByNums(nums, 2 * i + 1);
            node.right = buildTreeByNums(nums, 2 * i + 2);
            return node;
        }
        return null;
    }
}