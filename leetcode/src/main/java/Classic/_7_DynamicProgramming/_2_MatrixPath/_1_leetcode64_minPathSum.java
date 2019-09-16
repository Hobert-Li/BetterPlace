package Classic._7_DynamicProgramming._2_MatrixPath;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 11:51
 */


public class _1_leetcode64_minPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int dp[][] = new int[row][col];

        //初始化边界
        dp[row - 1][col - 1] = grid[row - 1][col - 1];
        for (int i = col - 2; i >= 0; i--) {
            dp[row - 1][i] = grid[row - 1][i] + dp[row - 1][i + 1];
        }
        for (int i = row - 2; i >= 0; i--) {
            dp[i][col - 1] = grid[i][col - 1] + dp[i + 1][col - 1];
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + grid[i][j];
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        _1_leetcode64_minPathSum solution = new _1_leetcode64_minPathSum();
        int[][] nums = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution.minPathSum(nums));
    }
}
