/**
 * <table border=1 cellspacing=0>
 * <tr><th>Date</th><th>Author</th><th>Description</th></tr>
 * <tr><td> 2019/7/31 18:42</td><td>Lhb</td><td>create</td></tr>
 * </table>
 */


public class _19_match {
    public boolean match(char[] str,char[] pattern) {
        int m = str.length,n = pattern.length;
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;
        for (int i = 1;i <= n;i++) {
            if (pattern[i-1] == '*')
                dp[0][i] = dp[0][i-2];
        }

        for (int i = 1;i <= m;i++)
            for (int j = 1;j <= n;j++)
                if (str[i - 1] == pattern[j - 1] || pattern[j - 1] =='.')
                    dp[i][j] = dp[i - 1][j - 1];
                else if (pattern[j - 1] == '*')
                    if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
                        dp[i][j] |= dp[i][j-1];
                        dp[i][j] |= dp[i-1][j];
                        dp[i][j] |= dp[i][j-2];
                    } else
                        dp[i][j] = dp[i][j-2];
        return dp[m][n];
    }

    public static void main(String[] args) {
        _19_match solution = new _19_match();
        String str = "abbbbc";
        String pattern = "a.*c";
        System.out.println(solution.match(str.toCharArray(),pattern.toCharArray()));
    }
}
