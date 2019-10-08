package Classic._6_Search._3_Backtracking;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/10/7 15:18
 */


public class _3_leetcode79_exist {
    private char[][] board;
    private int row;
    private int col;
    private boolean ret = false;

    private int[][] direction = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        if (word == null || board == null || word.length() == 0 || board.length == 0) {
            return false;
        }
        this.board = board;
        row = board.length;
        col = board[0].length;
        boolean[][] hasVisited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    char[][] b = copy(board);
                    dfs(i, j, word, hasVisited);
                }
            }
        }
        return ret;
    }

    private char[][] copy(char[][] board) {
        char[][] ret = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret[i][j] = board[i][j];
            }
        }
        return ret;
    }

    private void dfs(int i, int j, String s, boolean[][] hasVisited) {
        if (ret) {
            return;
        }
        if (s.length() == 0) {
            ret = true;
            return;
        }
        if (i < 0 || i >= row || j < 0 || j >= col || s.charAt(0) != board[i][j] || hasVisited[i][j]) {
            return;
        }
        hasVisited[i][j] = true;
        for (int[] d : direction) {
            dfs(i + d[0], j + d[1], s.substring(1), hasVisited);
        }
        hasVisited[i][j] = false;
    }

    public static void main(String[] args) {
        _3_leetcode79_exist solution = new _3_leetcode79_exist();
        char[][] board = {
                {'C', 'A', 'A'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'},
        };
        String word = "AAB";
        System.out.println(solution.exist(board, word));
    }
}
