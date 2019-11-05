package leetcode21_30;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</p>
 *
 * <p>题目名字： 22.括号生成</p>
 * <p>题目描述：给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。</p>
 *
 * <p>
 * 示例：
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/11/1 14:42
 */
public class _22_generateParenthesis {
    private List<String> res = new ArrayList<>();
    private int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        backtracking("", 0, 0);
        return res;
    }

    private void backtracking(String s, int left, int right) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (left < n) {
            backtracking(s + "(", left + 1, right);
        }
        if (right < left) {
            backtracking(s + ")", left, right + 1);
        }
    }

    public static void main(String[] args) {
        _22_generateParenthesis solution = new _22_generateParenthesis();
        int n = 3;
        System.out.println(JSON.toJSONString(solution.generateParenthesis(n)));
    }
}
