import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/7 18:21</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _32_1_PrintFromTopToBottom {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> ret = new ArrayList<Integer>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode t = queue.poll();
                if (t == null)
                    continue;
                ret.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return ret;
    }

}