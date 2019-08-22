package leetcode1_10;

/**
 * <p>题目名字： 5. 最长回文子串</p>
 * <p>题目描述： 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。</p>
 * <p>示例：输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。</p>
 *
 * @author 李宏博
 * @create 2019/8/20 16:52
 */

public class _5_longestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == "") {
            return "";
        }


        boolean[][] P = new boolean[s.length()][s.length()];

        String ret = "";
        for (int len = 1; len <= s.length() ; len++) {
            for (int i = 0; i + len - 1 < s.length() ; i++) {
                int j = i + len - 1;
                P[i][j] = (len == 1 || len == 2|| P[i+1][j-1]) && s.charAt(i) == s.charAt(j);

                if (P[i][j] && len > ret.length()) {
                    ret = s.substring(i,j + 1);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        _5_longestPalindrome solution = new _5_longestPalindrome();
        String s = "ccc";
        String ret = solution.longestPalindrome(s);
        System.out.println(ret);
    }
}
