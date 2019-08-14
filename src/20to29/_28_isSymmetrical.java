/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/1 18:46</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _28_isSymmetrical {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    private boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
        return isSymmetrical(t1.left,t2.right) && isSymmetrical(t1.right,t2.left);
    }

}
