import java.util.ArrayList;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/8/8 17:38</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _34_FindPath {
    private static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    private ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        backtracking(root,target,new ArrayList<Integer>());
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            ret.add(new ArrayList<Integer>(path));
        } else {
            backtracking(node.left,target,path);
            backtracking(node.right,target,path);
        }
        path.remove(path.size() - 1);
    }
}
