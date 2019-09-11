/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/28 16:07</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _54_TreeDepth {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public int TreeDepth(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
