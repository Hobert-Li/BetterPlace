package Classic._6_Search._2_DFS;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 14:02
 */


public class _5_leetcode417_pacificAtlantic {
    int row;
    int col;
    int[][] direction = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    int[][] matrix;
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ret = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ret;
        }
        row = matrix.length;
        col = matrix[0].length;
        this.matrix = matrix;
        boolean[][] get_1 = new boolean[row][col];
        boolean[][] get_2 = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            dfs(i, 0, get_1);
            dfs(i, col - 1, get_2);
        }
        for (int i = 0; i < col; i++) {
            dfs(0, i, get_1);
            dfs(row - 1, i, get_2);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (get_1[i][j] && get_2[i][j]) {
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(i);
                    t.add(j);
                    ret.add(t);
                }
            }
        }
        return ret;
    }

    private void dfs(int i, int j, boolean[][] get) {
        if (get[i][j]) {
            return;
        }
        get[i][j] = true;
        for (int[] d : direction) {
            if (i + d[0] < 0 || i + d[0] >= row ||
                    j + d[1] < 0 || j + d[1] >= col ||
                    matrix[i][j] > matrix[i + d[0]][j + d[1]]) {
                continue;
            }
            dfs(i + d[0], j + d[1], get);
        }
    }


    public static void main(String[] args) {
        _5_leetcode417_pacificAtlantic solution = new _5_leetcode417_pacificAtlantic();
        int[][] matrix = {
                {3,3,3,3,3,3},
                {3,0,3,3,0,3},
                {3,3,3,3,3,3}
        };
        System.out.println(JSON.toJSONString(solution.pacificAtlantic(matrix)));
    }
}
