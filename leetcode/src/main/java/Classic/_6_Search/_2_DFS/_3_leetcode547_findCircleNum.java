package Classic._6_Search._2_DFS;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 12:13
 */


public class _3_leetcode547_findCircleNum {
    private int n;
    public int findCircleNum(int[][] M) {
        n = M.length;
        boolean[] hasVistied = new boolean[n];
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (!hasVistied[i]) {
                dfs(M, i, hasVistied);
                ret++;
            }
        }
        return ret;
    }

    private void dfs(int[][] M, int i, boolean[] hasVistied) {
        hasVistied[i] = true;
        for (int j = 0; j < M[i].length; j++) {
            if (!hasVistied[j] && M[i][j] == 1) {
                dfs(M, j, hasVistied);
            }
        }
    }

    public static void main(String[] args) {
        _3_leetcode547_findCircleNum solution = new _3_leetcode547_findCircleNum();
        int[][] M = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };
        System.out.println(solution.findCircleNum(M));
    }
}
