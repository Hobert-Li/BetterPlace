import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/7 18:31</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _32_2_Print {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode node = queue.poll();
                if (node == null)
                    continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if (list.size() != 0)
                ret.add(list);
        }
        return ret;
    }
}
