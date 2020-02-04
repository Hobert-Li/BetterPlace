package leetcode31_40;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <p>题目名字：36. 有效的数独</p>
 * <p>题目描述：
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * </p>
 * <p>题目示例：
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: true
 * 示例 2:
 *
 * 输入:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: false
 * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
 *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * 说明:
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 *
 * </p>
 *
 * @author Hobert-Li
 * @create 2020/2/4 15:56
 */

//可以简化为一次遍历，用(i/3)*3 + j表示3x3宫格。
public class _36_validSudoku {
    public boolean isValidSudoku(char[][] board) {
        return searchRow(board) && searchCol(board) && search33(board);

    }

    private boolean searchRow(char[][] board) {
        int row = 9;
        int col = 9;
        for (int i = 0; i < row; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < col; j++) {
                char cur = board[i][j];
                if ('0' <= cur && cur <= '9') {
                    if (set.contains(cur)) {
                        return false;
                    }
                    set.add(cur);
                }
            }
        }
        return true;
    }

    private boolean searchCol(char[][] board) {
        int row = 9;
        int col = 9;
        for (int i = 0; i < col; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < row; j++) {
                char cur = board[j][i];
                if ('0' <= cur && cur <= '9') {
                    if (set.contains(cur)) {
                        return false;
                    }
                    set.add(cur);
                }
            }
        }
        return true;
    }

    private boolean search33(char[][] board) {
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int k = i; k <= i + 2; k++) {
                    for (int l = j; l <= j + 2; l++) {
                        char cur = board[k][l];
                        if ('0' <= cur && cur <= '9') {
                            if (set.contains(cur)) {
                                return false;
                            }
                            set.add(cur);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _36_validSudoku solution = new _36_validSudoku();
        String[][] temp= {
            {"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"},
        };
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = temp[i][j].charAt(0);
            }
        }
        System.out.println(solution.isValidSudoku(board));
    }
}
