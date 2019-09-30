package Classic._7_DynamicProgramming._8_EditString;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/30 14:52
 */


public class _2_leetcode72_minDistance {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 1; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= word2.length(); i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j],dp[i][j - 1]), dp[i - 1][j - 1] - 1);
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j],dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        _2_leetcode72_minDistance solution = new _2_leetcode72_minDistance();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(solution.minDistance(word1, word2));
    }
}
