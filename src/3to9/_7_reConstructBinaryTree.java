import java.util.HashMap;
import java.util.Map;

/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/30 10:35</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _7_reConstructBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer, Integer> indexForInOrders = new HashMap<Integer, Integer>();

    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        for (int i = 0;i < in.length;i++) {
            indexForInOrders.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }

    private TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int inL){
        if (preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre,preL + 1,preL + leftTreeSize,inL);
        root.right = reConstructBinaryTree(pre,preL + leftTreeSize +1,preR,inL + leftTreeSize + 1);
        return root;
    }

    public static void main(String[] args) {
        _7_reConstructBinaryTree solution = new _7_reConstructBinaryTree();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = solution.reConstructBinaryTree(pre,in);
        System.out.println(root);
    }
}
