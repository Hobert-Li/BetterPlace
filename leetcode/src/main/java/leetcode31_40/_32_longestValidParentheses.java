package leetcode31_40;

import java.util.Stack;

/**
 * <p>题目名字：32. 最长有效括号</p>
 * <p>题目描述：给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。</p>
 * <p>题目示例：示例 1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * </p>
 *
 * @author Hobert-Li
 * @create 2020/1/27 14:34
 */

//动态规划：dp数组中每个i表示第i个位置为头的最长有效括号。
//栈：栈中放位置而不是括号，弹栈时用位置计算长度

public class _32_longestValidParentheses {

    public int longestValidParentheses(String s) {
        int l = 0;
        int r = 0;
        int res = 0;
        int now = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                l++;
            }
            if (s.charAt(i) == ')') {
                r++;
            }
            if (l == r) {
                now = Math.max(now, l + r);
            } else if (r > l) {
                l = r = 0;
            }
        }
        res = Math.max(res, now);
        l = r = now = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                l++;
            }
            if (s.charAt(i) == ')') {
                r++;
            }
            if (l == r) {
                now = Math.max(now, l + r);
            } else if (r < l) {
                l = r = 0;
            }
        }
        res = Math.max(res, now);
        return res;
    }

    public static void main(String[] args) {
        _32_longestValidParentheses solution = new _32_longestValidParentheses();
        String s = "(()";
        System.out.println(solution.longestValidParentheses(s));
    }

}
