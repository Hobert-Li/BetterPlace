package Classic._6_Search._2_DFS;

import java.util.Arrays;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/6 13:13
 */


public class _4_leetcode130_solve {
    int row;
    int col;
    int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        row = board.length;
        col = board[0].length;
        for (int i = 0; i < row; i++) {
            dfs(board, i, 0);
            dfs(board, i, col - 1);
        }
        for (int i = 0; i < col; i++) {
            dfs(board, 0, i);
            dfs(board, row - 1, i);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'N') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }


    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'N';
        for (int[] d : direction) {
            dfs(board, i + d[0], j + d[1]);
        }
    }

    public static void main(String[] args) {
        _4_leetcode130_solve solution = new _4_leetcode130_solve();
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
        solution.solve(board);
        for (char[] c : board) {
            System.out.println(Arrays.toString(c));
        }
    }
}
