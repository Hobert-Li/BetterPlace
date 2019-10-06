package Classic._6_Search._2_DFS;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 10:42
 */


public class _1_leetcode695_maxAreaOfIsland {
    int[][] direction = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    int row;
    int col;
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret = Math.max(ret, dfs(grid, i, j));
            }
        }
        return ret;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == 0) {
            return 0;
        }
        int ret = 1;
        grid[i][j] = 0;
        for (int[] d : direction) {
            ret += dfs(grid, i + d[0], j + d[1]);
        }
        return ret;
    }

    public static void main(String[] args) {
        _1_leetcode695_maxAreaOfIsland solution = new _1_leetcode695_maxAreaOfIsland();
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(solution.maxAreaOfIsland(grid));
    }

}
