package Classic._6_Search._2_DFS;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 11:43
 */


public class _2_leetcode200_numIslands {
    int[][] direction = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    int row;
    int col;
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        row = grid.length;
        col = grid[0].length;
        int ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret += dfs(grid, i, j);
            }
        }
        return ret;
    }

    private int dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        for (int[] d : direction) {
            dfs(grid, i + d[0], j + d[1]);
        }
        return 1;
    }

    public static void main(String[] args) {
        _2_leetcode200_numIslands soultion = new _2_leetcode200_numIslands();
//        char[][] grid = {
//            {'1', '1', '1', '1', '0'},
//            {'1', '1', '0', '1', '0'},
//            {'1', '1', '0', '0', '0'},
//            {'0', '0', '0', '0', '0'},
//        };
        char[][] grid = {};
        System.out.println(soultion.numIslands(grid));
    }
}
