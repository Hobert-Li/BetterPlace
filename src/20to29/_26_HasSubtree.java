/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 18:37</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _26_HasSubtree {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        return isSubtreeWithRoot(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    private boolean isSubtreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isSubtreeWithRoot(root1.left,root2.left) && isSubtreeWithRoot(root1.right,root2.right);
    }

}
