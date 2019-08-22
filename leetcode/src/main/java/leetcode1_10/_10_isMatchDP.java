package leetcode1_10;

/**
 * <p>题目名字： 10. 正则表达式匹配</p>
 * <p>题目描述： 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。</p>
 * <p>
 * 示例 1:
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 *
 * 示例 2:
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 *
 * 示例 3:
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 *
 * 示例 4:
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 *
 * 示例 5:
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </p>
 *
 * @author 李宏博
 * @create 2019/8/21 18:21
 */

//？
public class _10_isMatchDP {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0 ; j--) {
                char pj = p.charAt(j);
                char sj = s.charAt(j);

                boolean first_match = (i < s.length() &&
                        (pj == sj || pj == '.') );

                if (j + 1 < p.length() && p.charAt(j+1) == '*') {
                    dp[i][j] = dp[i][j+2] || (first_match && dp[i+1][j]);//先与后或
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        _10_isMatchDP solution = new _10_isMatchDP();
        String s = "mississippi";
        String p = "mis*is*ippi";
        System.out.println(solution.isMatch(s, p));
    }
}
