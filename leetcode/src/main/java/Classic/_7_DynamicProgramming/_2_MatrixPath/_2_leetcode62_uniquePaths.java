package Classic._7_DynamicProgramming._2_MatrixPath;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/15 12:09
 */


public class _2_leetcode62_uniquePaths {
    public int uniquePaths(int m, int n) {
        int col = m;
        int row = n;
        int[][] dp = new int[row][col];

        //初始化边界
        dp[0][0] = 1;
        for (int i = 1; i < row; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < col; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        _2_leetcode62_uniquePaths solution = new _2_leetcode62_uniquePaths();
        int m = 7;
        int n = 3;
        System.out.println(solution.uniquePaths(m, n));
    }
}
