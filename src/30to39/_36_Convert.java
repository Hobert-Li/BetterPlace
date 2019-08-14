/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/8 18:03</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _36_Convert {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null) {
            pre.left = node;
        }
        pre = node;
        if (head == null)
            head = node;
        inOrder(node.right);
    }
}
